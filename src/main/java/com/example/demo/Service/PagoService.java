package com.example.demo.Service;



import com.example.demo.Model.EventoModel;
import com.example.demo.Model.PagosModel;
import com.example.demo.entity.Evento;
import com.example.demo.entity.Pagos;

import java.util.List;


public interface PagoService {
    public abstract PagosModel addPago(PagosModel pagosModel) throws Exception;

    public abstract List<PagosModel> listAllPagos();

public abstract Pagos findPagosById(int id);

public abstract void removePago(int id);

public abstract PagosModel findPagosByIdModel(int id);

        }
