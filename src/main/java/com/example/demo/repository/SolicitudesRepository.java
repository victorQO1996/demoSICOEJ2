package com.example.demo.repository;

import com.example.demo.entity.Ejidatario;
import com.example.demo.entity.Solicitudes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository("solicitudesRepository")
public class SolicitudesRepository extends JpaRepository<Solicitudes, Serializable>{
    public abstract Solicitudes findByID (int id);

    }
}
