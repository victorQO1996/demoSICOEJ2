package com.example.demo.Service;



import com.example.demo.Model.EventoModel;
import com.example.demo.entity.Evento;

import java.util.List;


public interface EventoService {
    public abstract EventoModel addContact(EventoModel eventoModel) throws Exception;

    public abstract List<EventoModel> listAllEventos();

    public abstract Evento findContactById(int id);

    public abstract void removeContact(int id);

    public abstract EventoModel findContactByIdModel(int id);

}
