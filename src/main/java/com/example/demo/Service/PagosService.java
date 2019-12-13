package com.example.demo.Service;



import com.uabc.database.example.examplejpa.entity.Pagos;
import com.uabc.database.example.examplejpa.model.PagosModel;

import java.util.List;


public interface PagosService {
    public abstract PagosModel addPagos(PagosModel PagosModel);

    public abstract List<PagosModel> listAllPagos();

    public abstract Pagos findPagosById(int id);

    public abstract void removePagos(int id);

    public abstract PagosModel findPagosByIdModel(int id);

}
