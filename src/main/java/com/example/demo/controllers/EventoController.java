package com.example.demo.controllers;


import com.example.demo.Model.EventoModel;
import com.example.demo.Service.EventoService;
import com.example.demo.constant.ViewConstant;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    @Qualifier("eventoServiceImpl")
    private EventoService eventoService;



    private static final Log log = LogFactory.getLog(EventoController.class);

    @GetMapping("/cancel")
    public String cancel(){
        return "redirect:/contacts/showContacts";
    }

    @GetMapping("/contactForm")
    public String redirectContactForm(Model model,
                                      @RequestParam(name = "id", required = false) int id){
        EventoModel eventoModel = new EventoModel();
        if(id != 0){
            eventoModel = eventoService.findContactByIdModel(id);
        }
        model.addAttribute("eventoModel", eventoModel);
        return ViewConstant.EVENTO_FORM;
    }

    @GetMapping("/calendario")
    public String calendario(Model model) {
        List<EventoModel> lista= eventoService.listAllEventos();
        model.addAttribute("lista",lista);
        return ViewConstant.CALENDARIO;
    }

    @PostMapping("/addcontact")
    //El ModelAttribute corresponde con el th:object que utilizamos en la vista de contactform
    public String addContact(@ModelAttribute (name = "eventoModel")@Valid EventoModel eventoModel,
                             Model model)throws Exception{
        log.info("Method: addContact() -- Params: "+eventoModel.toString());
        if(eventoService.addContact(eventoModel) != null){
            model.addAttribute("result", 1);//esto es para que se muestre un mensaje de que se agregó éxitosamente
        }else{
            model.addAttribute("result", 0);
        }
        return "redirect:/eventos/showContacts";
    }

    @GetMapping("/showContacts")
    public ModelAndView showContacts(){
        ModelAndView mav = new ModelAndView(ViewConstant.EVENTOS);
        mav.addObject("eventos", eventoService.listAllEventos());//evento
        return mav;
    }

    @GetMapping("/removeContact")
    public ModelAndView removeContact(@RequestParam(name = "id", required = true) int id){
        eventoService.removeContact(id);
        return showContacts();
    }


}