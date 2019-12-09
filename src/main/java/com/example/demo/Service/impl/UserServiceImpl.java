package com.example.demo.Service.impl;


import com.example.demo.Components.EventoConverter;
import com.example.demo.Components.UserConverter;
import com.example.demo.Model.EventoModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Service.EventoService;
import com.example.demo.Service.UserService;
import com.example.demo.entity.Evento;
import com.example.demo.entity.User;
import com.example.demo.repository.EventoRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userRepository")
    private UserRepository userRepository;

    @Autowired
    @Qualifier("userConverter")
    private UserConverter userConverter;

    @Override
    public UserModel addUser(UserModel userModel) throws Exception  {
        //Aquí nos pide una entidad, por lo tanto tenemos que transformar el contactModel a entidad
        User temp = userConverter.convertToContactModel2User(userModel);
        User user = userRepository.save(temp);
        return userConverter.convertContact2UserModelUser(user);
    }

    @Override
    public List<UserModel> listAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserModel> userModel = new ArrayList();
        for(User user : users){
            userModel.add(userConverter.convertContact2UserModelUser(user));


        }
        return userModel;
    }


    @Override
    public User findUserById(int id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User findUserByUser(String Usuario) {
        return userRepository.findUserByUser(Usuario);
    }


    public UserModel findUserByIdModel(int id){
        return userConverter.convertContact2UserModelUser(findUserById(id));
    }

    @Override
    public void removeuser(int id) {
        User user  = findUserById(id);
        if(user != null){
            userRepository.delete(findUserById(id));

        }
    }


}
