package com.example.demo.Service;

import com.example.demo.Model.EjidatarioModel;
import com.example.demo.entity.Ejidatario;

import java.util.List;

public interface SolicitudesService {

    public abstract EjidatarioModel addEjidatario(EjidatarioModel ejidatarioModel) throws Exception;

    public abstract List<EjidatarioModel> listAllEjidatarios();

    public abstract Ejidatario findEjidatarioById(int id);

    public abstract void removeEjidatario(int id);

    public abstract EjidatarioModel findEjidatarioByIdModel(int id);
}
