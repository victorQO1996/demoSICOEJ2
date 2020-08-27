package com.example.demo.controllers;



import com.example.demo.Model.SolicitudesModel;
import com.example.demo.Service.EjidatarioService;
import com.example.demo.Service.SolicitudesService;
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

@Controller
@RequestMapping("/solicitudes")
public class SolicitudesController {


    @Qualifier("solicitudesServiceImpl")
    private SolicitudesService solicitudesService;



    private static final Log log = LogFactory.getLog(SolicitudesController.class);

    @GetMapping("/cancel")
    public String cancel(){
        return "redirect:/solicitudes/showSolicitudes";
    }

    @GetMapping("/solicitudesForm")
    public String redirectSolicitudesForm(Model model,
                                         @RequestParam(name = "id", required = false) int id){
        SolicitudesModel solicitudesModel = new SolicitudesModel();
        if(id != 0){
            solicitudesModel = solicitudesService.findSolicitudesByIdModel(id);

        }
        model.addAttribute("solicitudesModel", solicitudesModel);
        return ViewConstant.SOLICITUDES;
    }




   /* @GetMapping("/calendario")
    public String calendario(Model model) {
        List<EventoModel> lista= eventoService.listAllEventos();
        model.addAttribute("lista",lista);
        return ViewConstant.CALENDARIO;
    }*/

    @PostMapping("/addSolicitudes")
    public String addSolicitudes(@ModelAttribute(name = "solicitudesModel")@Valid SolicitudesModel solicitudesModel,
                                Model model)throws Exception{
        log.info("Method: addSolicitudes() -- Params: "+solicitudesModel.toString());
        if(solicitudesService.addSolicitudes(solicitudesModel) != null){
            model.addAttribute("result", 1);//esto es para que se muestre un mensaje de que se agregó éxitosamente
        }else{
            model.addAttribute("result", 0);
        }
        return  ViewConstant.SOLICITUDES;    //return  "redirect:/ejidatarios/showEjidatarios";
    }

    @GetMapping("/showSolicitudes")
    public ModelAndView showSolicitudes(){
        ModelAndView mav = new ModelAndView(ViewConstant.SOLICITUDES);
        mav.addObject("solicitudes", solicitudesService.listAllSolicitudes());//evento
        return mav;
    }

    @GetMapping("/removeSolicitudes")
    public ModelAndView removeSolicitudes(@RequestParam(name = "id", required = true) int id){
        solicitudesService.removeSolicitudes(id);

        return showSolicitudes();
    }

}
