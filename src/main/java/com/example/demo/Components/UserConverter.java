package com.example.demo.Components;

import com.example.demo.Model.EventoModel;
import com.example.demo.Model.UserModel;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component("userConverter")
public class UserConverter {

        public User convertToContactModel2User(UserModel userModel)throws Exception{

            User user = new User();

            user.setId(userModel.getId());
            user.setUsuario(userModel.getUsuario());
            user.setContrasena(userModel.getContrasena());
            user.setTipoUsuario(userModel.getTipoUsuario());


            return user;
        }

        public UserModel convertContact2UserModelUser(User user){
            UserModel userModel = new UserModel();
            EventoModel eventoModel = new EventoModel();
            userModel.setId(user.getId());
            userModel.setUsuario(user.getUsuario());
            userModel.setContrasena(user.getContrasena());
            userModel.setTipoUsuario(user.getTipoUsuario());


            return userModel;
        }

}
