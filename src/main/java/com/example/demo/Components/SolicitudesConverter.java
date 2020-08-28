package com.example.demo.Components;

import com.example.demo.Model.EjidatarioModel;
import com.example.demo.Model.SolicitudesModel;
import com.example.demo.entity.Ejidatario;
import com.example.demo.entity.Solicitudes;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component("solicitudesConverter")
public class SolicitudesConverter {

    public Solicitudes convertToSolicitudesModel2Solicitudes(SolicitudesModel solicitudesModel)throws Exception{

        Solicitudes solicitudes = new Solicitudes();


        String[] fecha = solicitudesModel.getFechaSolicitada().split("T");
        Date fech = new SimpleDateFormat("yyyy-MM-dd").parse(fecha[0]);
        solicitudes.setId(solicitudesModel.getId());
        solicitudes.setFechaSolicitada(fech);
        //ejidatario.setFechaNacimiento(ejidatarioModel.getFechaNacimiento());
        solicitudes.setTipoSolicitud(solicitudesModel.getTipoSolicitud());
        solicitudes.setSolicitante(solicitudesModel.getSolicitante());
        solicitudes.setNumeroEjidatario(solicitudesModel.getNumeroEjidatario());
        solicitudes.setNumeLote(solicitudesModel.getNumeLote());
        solicitudes.setRazon(solicitudesModel.getRazon());

        return solicitudes;
    }

    public SolicitudesModel convertSolicitudes2SolicitudesModel(Solicitudes solicitudes){
        SolicitudesModel solicitudesModel = new SolicitudesModel();
        solicitudesModel.setId(solicitudes.getId());
        solicitudesModel.setFechaSolicitada(new SimpleDateFormat("yyyy-MM-dd").format(solicitudes.getFechaSolicitada()));
        solicitudesModel.setTipoSolicitud(solicitudes.getTipoSolicitud());
        solicitudesModel.setSolicitante(solicitudes.getSolicitante());
        solicitudesModel.setNumeroEjidatario(solicitudes.getNumeroEjidatario());
        solicitudesModel.setNumeLote(solicitudes.getNumeLote());
        solicitudesModel.setRazon(solicitudes.getRazon());



        return solicitudesModel;
    }

}

