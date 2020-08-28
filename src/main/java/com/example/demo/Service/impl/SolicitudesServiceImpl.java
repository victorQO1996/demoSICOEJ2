package com.example.demo.Service.impl;

import com.example.demo.Components.SolicitudesConverter;

import com.example.demo.Model.SolicitudesModel;
import com.example.demo.Service.EventoService;
import com.example.demo.Service.SolicitudesService;
import com.example.demo.entity.Ejidatario;
import com.example.demo.entity.Solicitudes;
import com.example.demo.repository.EjidatarioRepository;
import com.example.demo.repository.SolicitudesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.validation.OverridesAttribute;
import java.util.ArrayList;
import java.util.List;

@Service("solicitudesServiceImpl")

public class SolicitudesServiceImpl implements SolicitudesService {
    @Autowired
    @Qualifier("solicitudesRepository")
    private SolicitudesRepository solicitudesRepository;

    @Autowired
    @Qualifier("solicitudesConverter")
    private SolicitudesConverter solicitudesConverter;

    @Override
    public SolicitudesModel addSolicitudes(SolicitudesModel solicitudesModel) throws Exception  {
        //Aquí nos pide una entidad, por lo tanto tenemos que transformar el contactModel a entidad
        Solicitudes temp = solicitudesConverter.convertToSolicitudesModel2Solicitudes(solicitudesModel);
        Solicitudes solicitudes = solicitudesRepository.save(temp);
        return solicitudesConverter.convertSolicitudes2SolicitudesModel(solicitudes);
    }
    @Override
    public List<SolicitudesModel> listAllSolicitudes() {
        List<Solicitudes> solicitudes = solicitudesRepository.findAll();
        List<SolicitudesModel> solicitudesModel = new ArrayList();
        for(Solicitudes solicitudess : solicitudes){
            solicitudesModel.add(solicitudesConverter.convertSolicitudes2SolicitudesModel(solicitudess));
        }
        return solicitudesModel;
    }

    @Override
    public Solicitudes findSolicitudesById(int id) {
        return solicitudesRepository.findById(id);
    }

    public SolicitudesModel findSolicitudesByIdModel(int id){
        return solicitudesConverter.convertSolicitudes2SolicitudesModel(findSolicitudesById(id));
    }
    @Override
    public void removeSolicitudes(int id) {
        Solicitudes solicitudes  = findSolicitudesById(id);
        if(solicitudes != null){
            solicitudesRepository.delete(findSolicitudesById(id));
        }
    }
}
