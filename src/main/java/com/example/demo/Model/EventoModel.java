package com.example.demo.Model;

public class EventoModel {
    private int id;
    private String Nombre;
    private String Fecha;
    private String Horario;
    private String Descripcion;
    private String lugar;


    public EventoModel() {
    }

    public EventoModel(int id, String nombre, String fecha, String horario, String descripcion, String lugar) {
        this.id = id;
        this.Nombre = nombre;
        this.Fecha = fecha;
        this.Horario = horario;
        this.Descripcion = descripcion;
        this.lugar = lugar;
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

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
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
