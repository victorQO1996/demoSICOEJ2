package com.example.demo.Model;


public class UserModel {

    private int id;
    private String Usuario;
    private String Contrasena;
    private String TipoUsuario;

    public UserModel() {
    }

    public UserModel(int id, String usuario, String contrasena, String tipoUsuario) {
        this.id = id;
        this.Usuario = usuario;
        this.Contrasena = contrasena;
        this.TipoUsuario = tipoUsuario;
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
