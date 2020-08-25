package com.example.demo.Service.impl;

import com.example.demo.Components.EjidatarioConverter;
import com.example.demo.Model.EjidatarioModel;
import com.example.demo.Service.EjidatarioService;
import com.example.demo.entity.Ejidatario;
import com.example.demo.repository.EjidatarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

    @Service("SolicitudesServiceImpl")
    public class SolicitudesServiceImpl implements SolicitudesService {

        @Autowired
        @Qualifier("ejidatarioRepository")
        private EjidatarioRepository ejidatarioRepository;

        @Autowired
        @Qualifier("ejidatarioConverter")
        private EjidatarioConverter ejidatarioConverter;

        @Override
        public EjidatarioModel addEjidatario(EjidatarioModel ejidatarioModel) throws Exception  {
            //Aquí nos pide una entidad, por lo tanto tenemos que transformar el contactModel a entidad
            Ejidatario temp = ejidatarioConverter.convertToEjidatarioModel2Ejidatario(ejidatarioModel);
            Ejidatario ejidatario = ejidatarioRepository.save(temp);
            return ejidatarioConverter.convertEjidatario2EjidatarioModel(ejidatario);
        }

        @Override
        public List<EjidatarioModel> listAllEjidatarios() {
            List<Ejidatario> ejidatarios = ejidatarioRepository.findAll();
            List<EjidatarioModel> ejidatarioModel = new ArrayList();
            for(Ejidatario ejidatario : ejidatarios){
                ejidatarioModel.add(ejidatarioConverter.convertEjidatario2EjidatarioModel(ejidatario));


            }
            return ejidatarioModel;
        }

        @Override
        public Ejidatario findEjidatarioById(int id) {
            return ejidatarioRepository.findById(id);
        }

        public EjidatarioModel findEjidatarioByIdModel(int id){
            return ejidatarioConverter.convertEjidatario2EjidatarioModel(findEjidatarioById(id));
        }

        @Override
        public void removeEjidatario(int id) {
            Ejidatario ejidatario  = findEjidatarioById(id);
            if(ejidatario != null){
                ejidatarioRepository.delete(findEjidatarioById(id));
            }
        }


    }
}
