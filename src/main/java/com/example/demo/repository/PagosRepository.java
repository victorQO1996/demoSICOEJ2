package com.example.demo.repository;

import com.uabc.database.example.examplejpa.entity.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("pagosRepository")
public interface PagosRepository extends JpaRepository<Pagos, Serializable> {
    public abstract Pagos findById(int folioPago);
}
