package com.example.application.views.inicio;

public abstract class Receta {

    private int id;
    private String nombre;
    private String origen;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    private int tiempo;

    public Receta() {}

    public Receta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Receta(int id, String nombre, String origen, int tiempo) {
        this.id = id;
        this.nombre = nombre;
        this.origen = origen;
        this.tiempo = tiempo;
    }

    public abstract String getCategoria();

}