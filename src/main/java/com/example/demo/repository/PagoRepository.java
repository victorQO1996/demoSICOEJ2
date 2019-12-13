package com.example.demo.repository;

import com.example.demo.entity.Ejidatario;
import com.example.demo.entity.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("pagoRepository")
public interface PagoRepository extends JpaRepository<Pagos, Serializable> {
    public abstract Pagos findById(int id);
}
