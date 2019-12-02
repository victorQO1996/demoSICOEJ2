package com.example.demo.Service.impl;


import com.example.demo.Components.EventoConverter;
import com.example.demo.Model.EventoModel;
import com.example.demo.Service.EventoService;
import com.example.demo.entity.Evento;
import com.example.demo.repository.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("eventoServiceImpl")
public class EventoServiceImpl implements EventoService {

    @Autowired
    @Qualifier("eventoRepository")
    private EventoRepository eventoRepository;

    @Autowired
    @Qualifier("eventoConverter")
    private EventoConverter eventoConverter;

    @Override
    public EventoModel addContact(EventoModel eventoModel) throws Exception  {
        //Aquí nos pide una entidad, por lo tanto tenemos que transformar el contactModel a entidad
        Evento temp = eventoConverter.convertToContactModel2Contact(eventoModel);
        Evento evento = eventoRepository.save(temp);
        return eventoConverter.convertContact2ContactModel(evento);
    }

    @Override
    public List<EventoModel> listAllEventos() {
        List<Evento> eventos = eventoRepository.findAll();
        List<EventoModel> eventoModel = new ArrayList();
        for(Evento evento : eventos){
            eventoModel.add(eventoConverter.convertContact2ContactModel(evento));

        }
        return eventoModel;
    }

    @Override
    public Evento findContactById(int id) {
        return eventoRepository.findById(id);
    }

    public EventoModel findContactByIdModel(int id){
        return eventoConverter.convertContact2ContactModel(findContactById(id));
    }

    @Override
    public void removeContact(int id) {
        Evento evento  = findContactById(id);
        if(evento != null){
            eventoRepository.delete(findContactById(id));
        }
    }


}
