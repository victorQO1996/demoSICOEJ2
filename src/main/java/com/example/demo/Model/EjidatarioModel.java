package com.example.demo.Model;


import lombok.Data;

import java.util.Date;

@Data
public class EjidatarioModel {

    private int id;
    private String Nombre;
    private String Fecha;
    private String Email;
    private String CURP;
    private String Telefono;
    private String nombreEmpresa;
    private String telefonoEmpresa;
    private String direccionEmpresa;
    private String emailEmpresa;

    public EjidatarioModel() {
    }

    public EjidatarioModel(int id, String nombre, String Fecha, String email, String CURP, String telefono, String nombreEmpresa, String telefonoEmpresa, String direccionEmpresa, String emailEmpresa) {
        this.id = id;
        this.Nombre = nombre;
        this.Fecha = Fecha;
        this.Email = email;
        this.CURP = CURP;
        this.Telefono = telefono;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.emailEmpresa = emailEmpresa;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }


}
