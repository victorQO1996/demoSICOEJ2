package com.example.demo.Service;

import com.example.demo.Model.EjidatarioModel;
import com.example.demo.Model.SolicitudesModel;
import com.example.demo.entity.Ejidatario;
import com.example.demo.entity.Solicitudes;

import java.util.List;

public interface SolicitudesService {

    public abstract SolicitudesModel addSolicitudes(SolicitudesModel solicitudesModel) throws Exception;

    public abstract List<SolicitudesModel> listAllSolicitudes();

    public abstract Solicitudes findSolicitudesById(int id);

    public abstract void removeSolicitudes(int id);

    public abstract SolicitudesModel findSolicitudesByIdModel(int id);
}
