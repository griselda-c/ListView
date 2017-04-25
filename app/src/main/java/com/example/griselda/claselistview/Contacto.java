package com.example.griselda.claselistview;

/**
 * Created by Griselda on 25/04/2017.
 */

public class Contacto {
    private int telefono;
    private String nombre;
    private String apellido;

    public Contacto(int telefono, String nombre, String apellido) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
