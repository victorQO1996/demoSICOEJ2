package com.example.demo.Service.impl;



import com.example.demo.Components.PagoConverter;


import com.example.demo.Model.PagosModel;

import com.example.demo.Service.PagoService;

import com.example.demo.entity.Pagos;

import com.example.demo.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("pagoServiceImpl")
public class PagoServiceImpl implements PagoService {

    @Autowired
    @Qualifier("pagoRepository")
    private PagoRepository pagoRepository;

    @Autowired
    @Qualifier("pagoConverter")
    private PagoConverter pagosConverter;

    @Override
    public PagosModel addPago(PagosModel pagosModel) throws Exception  {
        //Aquí nos pide una entidad, por lo tanto tenemos que transformar el contactModel a entidad
        Pagos temp = pagosConverter.convertTopagosModel2pagos(pagosModel);
        Pagos pagos = pagoRepository.save(temp);
        return pagosConverter.convertpagos2pagosModel(pagos);
    }

    @Override
    public List<PagosModel> listAllPagos() {
        List<Pagos> pagos = pagoRepository.findAll();
        List<PagosModel> pagosModel = new ArrayList();
        for(Pagos pago : pagos){
            pagosModel.add(pagosConverter.convertpagos2pagosModel(pago));

        }
        return pagosModel;
    }

    @Override
    public Pagos findPagosById(int id) {
        return pagoRepository.findById(id);
    }

    public PagosModel findPagosByIdModel(int id){
        return pagosConverter.convertpagos2pagosModel(findPagosById(id));
    }

    @Override
    public void removePago(int id) {
        Pagos pagos  =  findPagosById(id);
        if(pagos != null){
            pagoRepository.delete(findPagosById(id));

        }
    }


}
