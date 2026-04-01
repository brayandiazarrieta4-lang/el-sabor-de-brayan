package com.example.application.model;

public class RecetaVegetariana extends Receta implements Mostrable {

    // CONSTRUCTORES
    public RecetaVegetariana() {
        super();
    }

    public RecetaVegetariana(int id, String nombre) {
        super(id, nombre);
    }

    public RecetaVegetariana(int id, String nombre, String origen, int tiempo) {
        super(id, nombre, origen, tiempo);
    }

    // METODOS
    @Override
    public String getCategoria() {
        return "Vegetariana";
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