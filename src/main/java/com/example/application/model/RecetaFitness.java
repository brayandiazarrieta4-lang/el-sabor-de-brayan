package com.example.application.model;

public class RecetaFitness extends Receta implements Mostrable {

    // CONSTRUCTORES
    public RecetaFitness() {
        super();
    }

    public RecetaFitness(int id, String nombre) {
        super(id, nombre);
    }

    public RecetaFitness(int id, String nombre, String origen, int tiempo) {
        super(id, nombre, origen, tiempo);
    }

    // METODOS
    @Override
    public String getCategoria() {
        return "Carne";
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