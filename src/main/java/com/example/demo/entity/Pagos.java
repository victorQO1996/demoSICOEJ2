package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="pagos")
public class Pagos {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "fechaPago")
    private Date fechaPago;

    @Column(name = "nombrePago")
    private String nombrePago;

    @Column(name = "conceptoPago")
    private String conceptopPago;

    @Column(name = "importePago")
    private float importePago;

    public Pagos(){

    }


    public Pagos(Date fechaPago, String nombrePago, String conceptopPago, float importePago) {
        this.fechaPago = fechaPago;
        this.nombrePago = nombrePago;
        this.conceptopPago = conceptopPago;
        this.importePago = importePago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getNombrePago() {
        return nombrePago;
    }

    public void setNombrePago(String nombrePago) {
        this.nombrePago = nombrePago;
    }

    public String getConceptopPago() {
        return conceptopPago;
    }

    public void setConceptopPago(String conceptopPago) {
        this.conceptopPago = conceptopPago;
    }

    public float getImportePago() {
        return importePago;
    }

    public void setImportePago(float importePago) {
        this.importePago = importePago;
    }
}
