package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="Solicitudes")
public class Solicitudes {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "FechaSolicitada")
    private Date FechaSolicitada;

    @Column(name = "TipoSolicitud")
    private String TipoSolicitud;

    @Column(name = "Solicitante")
    private String Solicitante;

    @Column(name = "NumeroEjidatario")
    private String NumeroEjidatario;

    @Column(name = "NumeLote")
    private String NumeLote;

    @Column(name = "Razon")
    private String Razon;


    public Solicitudes(Date fechaSolicitada, String tipoSolicitud, String solicitante, String numeroEjidatario, String numeLote, String razon) {
        this.FechaSolicitada = fechaSolicitada;
        this.TipoSolicitud = tipoSolicitud;
        this.Solicitante = solicitante;
        this.NumeroEjidatario = numeroEjidatario;
        this.NumeLote = numeLote;
        this.Razon = razon;
    }

    public Solicitudes() {

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
