package com.example.demo.Components;

import com.uabc.database.example.examplejpa.entity.Pagos;
import com.uabc.database.example.examplejpa.model.PagosModel;
import org.springframework.stereotype.Component;

@Component("pagosConverter")
public class PagosConverter {
    public Pagos convertTopagosModel2pagos(PagosModel pagosModel){
        Pagos pagos = new Pagos();

        pagos.setFolioPago(pagosModel.getFolioPago());
        pagos.setFechaPago(pagosModel.getFechaPago());
        pagos.setNombrePago(pagosModel.getNombrePago());
        pagos.setConceptopPago(pagosModel.getConceptopPago());
        pagos.setImportePago(pagosModel.getImportePago());
        return pagos;
    }

    public PagosModel convertpagos2pagosModel(Pagos pagos){
        PagosModel pagosModel = new PagosModel();
        pagosModel.setFolioPago(pagos.getFolioPago());
        pagosModel.setFechaPago(pagos.getFechaPago());
        pagosModel.setNombrePago(pagos.getNombrePago());
        pagosModel.setConceptopPago(pagos.getConceptopPago());
        pagosModel.setImportePago(pagos.getImportePago());
        return pagosModel;
    }
}
