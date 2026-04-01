package com.example.application.model;

public class RecetaPostre extends Receta implements Mostrable {

    // CONSTRUCTORES
    public RecetaPostre() {
        super();
    }

    public RecetaPostre(int id, String nombre) {
        super(id, nombre);
    }

    public RecetaPostre(int id, String nombre, String origen, int tiempo) {
        super(id, nombre, origen, tiempo);
    }

    // METODOS
    @Override
    public String getCategoria() {
        return "Postre";
    }

    @Override
    public String mostrarDatos() {
        return "Nombre: " + getNombre() +
               ", Categoría: " + getCategoria() +
               ", Origen: " + getOrigen() +
               ", Tiempo: " + getTiempo() + " min" +
               ", Ingredientes: " + getIngredientes() +
               ", Implementos: " + getImplementos();
    }
}