package com.example.demo.Service;



import com.example.demo.Model.EventoModel;
import com.example.demo.Model.UserModel;
import com.example.demo.entity.Evento;
import com.example.demo.entity.User;

import java.util.List;


public interface UserService {
    public abstract UserModel addUser(UserModel userModel) throws Exception;

    public abstract List<UserModel> listAllUsers();

    public abstract User findUserById(int id);

    public abstract void removeuser(int id);

    public abstract UserModel findUserByIdModel(int id);

}
