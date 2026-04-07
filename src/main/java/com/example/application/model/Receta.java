package com.example.application.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Receta {

    // ATRIBUTOS
    private int id;
    private String imagen;
    private String nombre;
    private String origen;
    private int tiempo;

    private List<String> ingredientes;
    private List<String> implementos;
    private String detalles;
    private String tips;

    // CONSTRUCTORES
    public Receta() {
        this.ingredientes = new ArrayList<>();
        this.implementos = new ArrayList<>();
    }

    public Receta(int id, String nombre) {
        this();
        this.id = id;
        this.nombre = nombre;
    }

    public Receta(int id, String nombre, String origen, int tiempo) {
        this(id, nombre);
        this.origen = origen;
        this.tiempo = tiempo;
    }
 

    // GETTER Y SETTER ID

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // GETTER Y SETTER NOMBRE
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // GETTER Y SETTER ORIGEN
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    // GETTER Y SETTER TIEMPO
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    // GETTER INGREDIENTES E IMPLEMENTOS
    public List<String> getIngredientes() {
        return ingredientes;
    }

    public List<String> getImplementos() {
        return implementos;
    }
    // GETTER Y SETTER DETALLES
    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    // GETTER Y SETTER TIPS
    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    // MÉTODOS

    public abstract String getCategoria();

    // Sobrecarga 
    public void agregarIngrediente(String ing) {
        ingredientes.add(ing);
    }

    public void agregarIngrediente(String ing, int cantidad) {
        ingredientes.add(ing + " x" + cantidad);
    }

    public void agregarImplemento(String imp) {
        implementos.add(imp);
    }

}