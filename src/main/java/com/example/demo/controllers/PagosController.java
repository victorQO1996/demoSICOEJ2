package com.example.demo.controllers;


import com.uabc.database.example.examplejpa.constant.ViewConstant;
import com.uabc.database.example.examplejpa.model.PagosModel;
import com.uabc.database.example.examplejpa.services.PagosService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pagos")
public class PagosController {

    @Autowired
    @Qualifier("PagosServiceImpl")
    private PagosService pagosService;

    private static final Log log = LogFactory.getLog(PagosController.class);

    @GetMapping("/cancel")
    public String cancel(){
        return "redirect:/pagoss/showpagoss";
    }

    @GetMapping("/pagosForm")
    public String redirectpagosForm(Model model,
                                      @RequestParam(name = "id", required = false) int id){
        PagosModel pagosModel = new PagosModel();
        if(id != 0){
            pagosModel = pagosService.findPagosByIdModel(id);
        }
        model.addAttribute("pagosModel", pagosModel);
        return ViewConstant.PAGOS_FORM;
    }

    @PostMapping("/addpagos")
    //El ModelAttribute corresponde con el th:object que utilizamos en la vista de pagosform
    public String addpagos(@ModelAttribute(name = "pagosModel")PagosModel pagosModel,
                             Model model){
        log.info("Method: addpagos() -- Params: "+pagosModel.toString());
        if(pagosService.addPagos(pagosModel) != null){
            model.addAttribute("result", 1);//esto es para que se muestre un mensaje de que se agregó éxitosamente
        }else{
            model.addAttribute("result", 0);
        }
        return "redirect:/pagoss/showpagoss";
    }

    @GetMapping("/showpagoss")
    public ModelAndView showpagoss(){
        ModelAndView mav = new ModelAndView(ViewConstant.PAGOS);
        mav.addObject("pagos", pagosService.listAllPagos());
        return mav;
    }

    @GetMapping("/removepagos")
    public ModelAndView removepagos(@RequestParam(name = "id", required = true) int id){
        pagosService.removePagos(id);
        return showpagoss();
    }


}