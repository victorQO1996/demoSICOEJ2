package com.example.demo.repository;

import com.example.demo.entity.Ejidatario;
import com.example.demo.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("ejidatarioRepository")
public interface EjidatarioRepository extends JpaRepository<Ejidatario, Serializable> {
    public abstract Ejidatario findById(int id);
}
