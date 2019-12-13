 package com.example.demo.controllers;


import com.example.demo.Model.EjidatarioModel;
import com.example.demo.Model.EventoModel;
import com.example.demo.Service.EjidatarioService;
import com.example.demo.Service.EventoService;
import com.example.demo.constant.ViewConstant;
import com.example.demo.entity.Ejidatario;
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
@RequestMapping("/ejidatarios")
public class EjidatarioController {

    @Autowired
    @Qualifier("ejidatarioServiceImpl")
    private EjidatarioService ejidatarioService;



    private static final Log log = LogFactory.getLog(EjidatarioController.class);

    @GetMapping("/cancel")
    public String cancel(){
        return "redirect:/ejidatarios/showEjidatarios";
    }

    @GetMapping("/ejidatarioForm")
    public String redirectEjidatarioForm(Model model,
                                      @RequestParam(name = "id", required = false) int id){
        EjidatarioModel ejidatarioModel = new EjidatarioModel();
        if(id != 0){
            ejidatarioModel = ejidatarioService.findEjidatarioByIdModel(id);

        }
        model.addAttribute("ejidatarioModel", ejidatarioModel);
        return ViewConstant.EJIDATARIO_FORM;
    }

   /* @GetMapping("/calendario")
    public String calendario(Model model) {
        List<EventoModel> lista= eventoService.listAllEventos();
        model.addAttribute("lista",lista);
        return ViewConstant.CALENDARIO;
    }*/

    @PostMapping("/addejidatario")
    //El ModelAttribute corresponde con el th:object que utilizamos en la vista de contactform
    public String addEjidatario(@ModelAttribute (name = "ejidatarioModel")@Valid EjidatarioModel ejidatarioModel,
                                Model model)throws Exception{
        log.info("Method: addContact() -- Params: "+ejidatarioModel.toString());
        if(ejidatarioService.addEjidatario(ejidatarioModel) != null){
            model.addAttribute("result", 1);//esto es para que se muestre un mensaje de que se agregó éxitosamente
        }else{
            model.addAttribute("result", 0);
        }
        return  ViewConstant.EJIDATARIOS;    //return  "redirect:/ejidatarios/showEjidatarios";
    }

    @GetMapping("/showEjidatarios")
    public ModelAndView showEjidatarios(){
        ModelAndView mav = new ModelAndView(ViewConstant.EJIDATARIOS);
        mav.addObject("ejidatarios", ejidatarioService.listAllEjidatarios());//evento
        return mav;
    }

    @GetMapping("/removeEjidatario")
    public ModelAndView removeEjidatario(@RequestParam(name = "id", required = true) int id){
        ejidatarioService.removeEjidatario(id);

        return showEjidatarios();
    }


}
