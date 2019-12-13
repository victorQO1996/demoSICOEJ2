package com.example.demo.Service.impl;


import com.uabc.database.example.examplejpa.components.PagosConverter;
import com.uabc.database.example.examplejpa.entity.Pagos;
import com.uabc.database.example.examplejpa.model.PagosModel;
import com.uabc.database.example.examplejpa.respository.PagosRepository;
import com.uabc.database.example.examplejpa.services.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("PagosServiceImpl")
public class PagosServiceImpl implements PagosService {

    @Autowired
    @Qualifier("pagosRepository")
    private PagosRepository pagosRepository;

    @Autowired
    @Qualifier("pagosConverter")
    private PagosConverter pagosConverter;

    @Override
    public PagosModel addPagos(PagosModel pagosModel) {
        //Aquí nos pide una entidad, por lo tanto tenemos que transformar el pagosModel a entidad
        Pagos temp=pagosConverter.convertTopagosModel2pagos(pagosModel);
        Pagos pagos = pagosRepository.save(temp);
        return pagosConverter.convertpagos2pagosModel(pagos);
    }

    @Override
    public List<PagosModel> listAllPagos() {
        List<Pagos> pagoss = pagosRepository.findAll();
        List<PagosModel> pagossModel = new ArrayList();
        for(Pagos pagos : pagoss){
            pagossModel.add(pagosConverter.convertpagos2pagosModel(pagos));

        }
        return pagossModel;
    }

    @Override
    public Pagos findPagosById(int id) {
        return pagosRepository.findById(id);
    }

    public PagosModel findPagosByIdModel(int id){
        return pagosConverter.convertpagos2pagosModel(findPagosById(id));
    }

    @Override
    public void removePagos(int id) {
        Pagos pagos  = findPagosById(id);
        if(pagos != null){
            pagosRepository.delete(findPagosById(id));
        }
    }



}
