package com.example.demo.controllers;


import com.example.demo.Model.EventoModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Service.EventoService;
import com.example.demo.Service.UserService;
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
@RequestMapping("/users")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;



    private static final Log log = LogFactory.getLog(UserController.class);

    @GetMapping("/cancel")
    public String cancel(){
        return "redirect:/users/showUsers";
    }

    @GetMapping("/userForm")
    public String redirectUserForm(Model model,
                                      @RequestParam(name = "id", required = false) int id, String Usuario){
        UserModel userModel = new UserModel();

        if(id != 0){
            userModel = userService.findUserByIdModel(id);

        }
        model.addAttribute("userModel", userModel);
        return ViewConstant.USER_FORM;
    }

   /* @GetMapping("/calendario")
    public String calendario(Model model) {
        List<EventoModel> lista= eventoService.listAllEventos();
        model.addAttribute("lista",lista);
        return ViewConstant.CALENDARIO;
    }*/

    @PostMapping("/adduser")
    //El ModelAttribute corresponde con el th:object que utilizamos en la vista de contactform
    public String addUser(@ModelAttribute (name = "userModel")@Valid UserModel userModel,
                             Model model)throws Exception{
        log.info("Method: addUser() -- Params: "+userModel.toString());
        if(userService.addUser(userModel) != null){
            model.addAttribute("result", 1);//esto es para que se muestre un mensaje de que se agregó éxitosamente
        }else{
            model.addAttribute("result", 0);
        }
        return "redirect:/users/showUsers";
    }

    @GetMapping("/showUsers")
    public ModelAndView showUsers(){
        ModelAndView mav = new ModelAndView(ViewConstant.USUARIOS);
        mav.addObject("users", userService.listAllUsers());//evento
        return mav;
    }

    @GetMapping("/removeUser")
    public ModelAndView removeUser(@RequestParam(name = "id", required = true) int id){
        userService.removeuser(id);
        return showUsers();
    }


}