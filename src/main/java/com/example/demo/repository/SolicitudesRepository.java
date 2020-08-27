package com.example.demo.repository;

import com.example.demo.entity.Ejidatario;
import com.example.demo.entity.Evento;
import com.example.demo.entity.Solicitudes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("solicitudesRepository")
public interface SolicitudesRepository extends JpaRepository<Solicitudes, Serializable> {
    public abstract Solicitudes findById(int id);
}


