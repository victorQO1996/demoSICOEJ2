package com.example.demo.Model;

import javax.persistence.Column;
import java.util.Date;

public class SolicitudesModel {


    private int id;
    private Date FechaSolicitada;
    private String TipoSolicitud;
    private String Solicitante;
    private String NumeroEjidatario;
    private String NumeLote;
    private String Razon;

    public SolicitudesModel(int id, Date fechaSolicitada, String tipoSolicitud, String solicitante, String numeroEjidatario, String numeLote, String razon) {
        this.id = id;
        this.FechaSolicitada = fechaSolicitada;
        this.TipoSolicitud = tipoSolicitud;
        this.Solicitante = solicitante;
        this.NumeroEjidatario = numeroEjidatario;
        this.NumeLote = numeLote;
        this.Razon = razon;
    }

    public SolicitudesModel() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaSolicitada() {
        return FechaSolicitada;
    }

    public void setFechaSolicitada(Date fechaSolicitada) {
        FechaSolicitada = fechaSolicitada;
    }

    public String getTipoSolicitud() {
        return TipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        TipoSolicitud = tipoSolicitud;
    }

    public String getSolicitante() {
        return Solicitante;
    }

    public void setSolicitante(String solicitante) {
        Solicitante = solicitante;
    }

    public String getNumeroEjidatario() {
        return NumeroEjidatario;
    }

    public void setNumeroEjidatario(String numeroEjidatario) {
        NumeroEjidatario = numeroEjidatario;
    }

    public String getNumeLote() {
        return NumeLote;
    }

    public void setNumeLote(String numeLote) {
        NumeLote = numeLote;
    }

    public String getRazon() {
        return Razon;
    }

    public void setRazon(String razon) {
        Razon = razon;
    }
}
