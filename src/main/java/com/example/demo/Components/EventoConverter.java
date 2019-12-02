package com.example.demo.Components;

import com.example.demo.Model.EventoModel;
import com.example.demo.entity.Evento;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component("eventoConverter")
public class EventoConverter {

        public Evento convertToContactModel2Contact(EventoModel eventoModel)throws Exception{
            Evento evento = new Evento();

            String[] fecha = eventoModel.getFecha().split("T");//hh:mm
            Date fech = new SimpleDateFormat("yyyy-MM-dd").parse(fecha[0]);
            evento.setId(eventoModel.getId());
            evento.setNombre(eventoModel.getNombre());
            //evento.setFecha(eventoModel.getFecha());
            evento.setFecha(fech);
            evento.setHorario(eventoModel.getHorario());
            evento.setDescripcion(eventoModel.getDescripcion());
            evento.setLugar(eventoModel.getLugar());

            return evento;
        }

        public EventoModel convertContact2ContactModel(Evento evento){
            EventoModel eventoModel = new EventoModel();
            eventoModel.setId(evento.getId());
            eventoModel.setNombre(evento.getNombre());
            eventoModel.setFecha(new SimpleDateFormat("yyyy-MM-dd").format(evento.getFecha()));
            //eventoModel.setFecha(evento.getFecha());
            eventoModel.setHorario(evento.getHorario());
            eventoModel.setDescripcion(evento.getDescripcion());
            eventoModel.setLugar(evento.getLugar());

            return eventoModel;
        }

}
