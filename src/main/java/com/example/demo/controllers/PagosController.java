package com.example.demo.controllers;


import com.example.demo.Model.PagosModel;
import com.example.demo.Service.PagoService;
import com.example.demo.constant.ViewConstant;

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
    @Qualifier("pagoServiceImpl")
    private PagoService pagoService;

    private static final Log log = LogFactory.getLog(PagosController.class);

    @GetMapping("/cancel")
    public String cancel(){
        return "redirect:/pagos/showPagoss";
    }

    @GetMapping("/pagosForm")
    public String redirectpagosForm(Model model,
                                      @RequestParam(name = "id", required = false) int id){
        PagosModel pagosModel = new PagosModel();
        if(id != 0){
            pagosModel = pagoService.findPagosByIdModel(id);
        }
        model.addAttribute("pagosModel", pagosModel);
        return ViewConstant.PAGOS_FORM;
    }

    @PostMapping("/addPago")
    //El ModelAttribute corresponde con el th:object que utilizamos en la vista de pagosform
    public String addPago(@ModelAttribute(name = "pagosModel")PagosModel pagosModel,
                             Model model) throws Exception {
        log.info("Method: addPago() -- Params: "+pagosModel.toString());
        if(pagoService.addPago(pagosModel) != null){
            model.addAttribute("result", 1);//esto es para que se muestre un mensaje de que se agregó éxitosamente
        }else{
            model.addAttribute("result", 0);
        }
        return "redirect:/pagos/showPagoss";
    }

    @GetMapping("/showPagoss")
    public ModelAndView showPagoss(){
        ModelAndView mav = new ModelAndView(ViewConstant.PAGOS);
        mav.addObject("pagos", pagoService.listAllPagos());
        return mav;
    }

    @GetMapping("/removePagos")
    public ModelAndView removePagos(@RequestParam(name = "id", required = true)int id){
        pagoService.removePago(id);
        return showPagoss();
    }


}