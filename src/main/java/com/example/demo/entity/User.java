package com.example.demo.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "Usuario")
    private String Usuario;

    @Column(name = "Contraseña")
    private String Contrasena;

    @Column(name = "TipoUsuario")
    private String TipoUsuario;


    public User(String usuario, String contraseña, String tipoUsuario) {
        this.Usuario = usuario;
        this.Contrasena = contraseña;
        this.TipoUsuario = tipoUsuario;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        TipoUsuario = tipoUsuario;
    }
}
