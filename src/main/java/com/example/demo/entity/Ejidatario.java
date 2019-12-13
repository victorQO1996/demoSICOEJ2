package com.example.demo.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="Ejidatario")
public class Ejidatario {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "FechaNacimiento")
    private Date Fecha;

    @Column(name = "Email")
    private String Email;

    @Column(name = "CURP")
    private String CURP;

    @Column(name = "Telefono")
    private String Telefono;

    @Column(name = "NombreEmpresa")
    private String nombreEmpresa;

    @Column(name = "TelefonoEmpresa")
    private String telefonoEmpresa;

    @Column(name = "DireccionEmpresa")
    private String direccionEmpresa;

    @Column(name = "EmailEmpresa")
    private String emailEmpresa;



    public Ejidatario(String nombre, Date Fecha, String email, String CURP, String telefono, String nombreEmpresa, String telefonoEmpresa, String direccionEmpresa, String emailEmpresa) {
        this.Nombre = nombre;
        this.Fecha= Fecha;
        this.Email = email;
        this.CURP = CURP;
        this.Telefono = telefono;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.emailEmpresa = emailEmpresa;
    }

    public Ejidatario() {
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
