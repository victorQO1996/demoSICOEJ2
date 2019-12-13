package com.example.demo.Components;

import com.example.demo.Model.PagosModel;
import com.example.demo.entity.Pagos;

import org.springframework.stereotype.Component;

@Component("pagoConverter")
public class PagoConverter {
    public Pagos convertTopagosModel2pagos(PagosModel pagosModel){
        Pagos pagos = new Pagos();

        pagos.setId(pagosModel.getId());
        pagos.setFechaPago(pagosModel.getFechaPago());
        pagos.setNombrePago(pagosModel.getNombrePago());
        pagos.setConceptopPago(pagosModel.getConceptopPago());
        pagos.setImportePago(pagosModel.getImportePago());
        return pagos;
    }

    public PagosModel convertpagos2pagosModel(Pagos pagos){
        PagosModel pagosModel = new PagosModel();
        pagosModel.setId(pagos.getId());
        pagosModel.setFechaPago(pagos.getFechaPago());
        pagosModel.setNombrePago(pagos.getNombrePago());
        pagosModel.setConceptopPago(pagos.getConceptopPago());
        pagosModel.setImportePago(pagos.getImportePago());
        return pagosModel;
    }
}
