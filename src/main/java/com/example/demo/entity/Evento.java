package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="EventosR")
public class Evento {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Fecha")
    private Date Fecha;

    @Column(name = "Horario")
    private String Horario;

    @Column(name = "Descripcion")
    private String Descripcion;

    @Column(name = "lugar")
    private String lugar;

    public Evento(String nombre, Date fecha, String horario, String descripcion, String lugar) {
        Nombre = nombre;
        Fecha = fecha;
        Horario = horario;
        Descripcion = descripcion;
        this.lugar = lugar;
    }

    public Evento(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
