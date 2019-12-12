package com.example.demo.Components;


import com.example.demo.Model.EjidatarioModel;
import com.example.demo.entity.Ejidatario;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component("ejidatarioConverter")
public class EjidatarioConverter {

        public Ejidatario convertToEjidatarioModel2Ejidatario(EjidatarioModel ejidatarioModel)throws Exception{

            Ejidatario ejidatario = new Ejidatario();

            String[] fecha = ejidatarioModel.getFecha().split("T");
            Date fech = new SimpleDateFormat("yyyy-MM-dd").parse(fecha[0]);

            ejidatario.setId(ejidatarioModel.getId());
            ejidatario.setNombre(ejidatarioModel.getNombre());
            ejidatario.setFecha(fech);
            //ejidatario.setFechaNacimiento(ejidatarioModel.getFechaNacimiento());
            ejidatario.setEmail(ejidatarioModel.getEmail());
            ejidatario.setCURP(ejidatarioModel.getCURP());
            ejidatario.setTelefono(ejidatarioModel.getTelefono());
            ejidatario.setNombreEmpresa(ejidatarioModel.getNombreEmpresa());
            ejidatario.setTelefonoEmpresa(ejidatarioModel.getTelefonoEmpresa());
            ejidatario.setDireccionEmpresa(ejidatarioModel.getDireccionEmpresa());
            ejidatario.setEmailEmpresa(ejidatarioModel.getEmailEmpresa());



            return ejidatario;
        }

        public EjidatarioModel convertEjidatario2EjidatarioModel(Ejidatario ejidatario){
            EjidatarioModel ejidatarioModel = new EjidatarioModel();

            ejidatarioModel.setId(ejidatario.getId());
            ejidatarioModel.setNombre(ejidatario.getNombre());
            ejidatarioModel.setFecha( new SimpleDateFormat("yyyy-MM-dd").format(ejidatario.getFecha()));
            ejidatarioModel.setEmail(ejidatario.getEmail());
            ejidatarioModel.setCURP(ejidatario.getCURP());
            ejidatarioModel.setTelefono(ejidatario.getTelefono());
            ejidatarioModel.setNombreEmpresa(ejidatario.getNombreEmpresa());
            ejidatarioModel.setTelefonoEmpresa(ejidatario.getTelefonoEmpresa());
            ejidatarioModel.setDireccionEmpresa(ejidatario.getDireccionEmpresa());
            ejidatarioModel.setEmailEmpresa(ejidatario.getEmailEmpresa());


            return ejidatarioModel;
        }

}
