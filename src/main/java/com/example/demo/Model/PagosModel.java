package com.example.demo.Model;

import java.util.Date;

public class PagosModel {
    private int id;
    private Date fechaPago;
    private String nombrePago;
    private String conceptopPago;
    private float importePago;

    public PagosModel() {
    }

    public PagosModel(int id, Date fechaPago, String nombrePago, String conceptopPago, float importePago) {
        this.id = id;
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
