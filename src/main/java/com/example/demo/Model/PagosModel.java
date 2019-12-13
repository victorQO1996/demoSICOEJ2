package com.example.demo.Model;

import java.util.Date;

public class PagosModel {
    private Date fechaPago;
    private int folioPago;
    private String nombrePago;
    private String conceptopPago;
    private float importePago;

    public PagosModel(Date fechaPago, int folioPago, String nombrePago, String conceptopPago, float importePago) {
        this.fechaPago = fechaPago;
        this.folioPago = folioPago;
        this.nombrePago = nombrePago;
        this.conceptopPago = conceptopPago;
        this.importePago = importePago;
    }

    public PagosModel() {

    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getFolioPago() {
        return folioPago;
    }

    public void setFolioPago(int folioPago) {
        this.folioPago = folioPago;
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

    @Override
    public String toString() {
        return "PagosModel{" +
                "fechaPago=" + fechaPago +
                ", folioPago=" + folioPago +
                ", nombrePago='" + nombrePago + '\'' +
                ", conceptopPago='" + conceptopPago + '\'' +
                ", importePago=" + importePago +
                '}';
    }
}
