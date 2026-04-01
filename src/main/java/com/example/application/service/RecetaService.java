package com.example.application.service;

import com.example.application.model.*;

import java.util.ArrayList;
import java.util.List;

public class RecetaService {

    private List<Receta> recetas;

    // CONSTRUCTOR
    public RecetaService() {
        recetas = new ArrayList<>();
        cargarDatos();
    }

    // CARGAR DATOS DE PRUEBA
    private void cargarDatos() {

        // CARNE
        Receta carne1 = new RecetaCarne(1, "Carne Asada", "Colombia", 60);
        carne1.agregarIngrediente("Carne");
        carne1.agregarIngrediente("Sal", 2);
        carne1.agregarImplemento("Parrilla");
        carne1.setDetalles("Cocinar a fuego medio durante 60 minutos");
        carne1.setTips("Dejar reposar la carne antes de servir");

        // POSTRE
        Receta postre1 = new RecetaPostre(2, "Torta de Chocolate", "Francia", 45);
        postre1.agregarIngrediente("Harina");
        postre1.agregarIngrediente("Chocolate", 3);
        postre1.agregarImplemento("Horno");
        postre1.setDetalles("Hornear a 180 grados por 45 minutos");
        postre1.setTips("No abrir el horno antes de tiempo");

        // VEGETARIANA
        Receta veg1 = new RecetaVegetariana(3, "Ensalada Fresca", "México", 15);
        veg1.agregarIngrediente("Lechuga");
        veg1.agregarIngrediente("Tomate", 2);
        veg1.agregarImplemento("Cuchillo");
        veg1.setDetalles("Mezclar todos los ingredientes");
        veg1.setTips("Agregar limón al final");

        recetas.add(carne1);
        recetas.add(postre1);
        recetas.add(veg1);
    }

    // OBTENER TODAS LAS RECETAS (PROTEGIDO)
    public List<Receta> obtenerTodas() {
        return new ArrayList<>(recetas);
    }

    // FILTRAR POR CATEGORIA
    public List<Receta> obtenerPorCategoria(String categoria) {

        List<Receta> resultado = new ArrayList<>();

        for (Receta r : recetas) {
            if (r.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(r);
            }
        }

        return resultado;
    }

    // AGREGAR RECETA
    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }

    // BUSCAR POR ID
    public Receta buscarPorId(int id) {

        for (Receta r : recetas) {
            if (r.getId() == id) {
                return r;
            }
        }

        return null;
    }

    // ELIMINAR RECETA (EXTRA)
    public boolean eliminarReceta(int id) {
        return recetas.removeIf(r -> r.getId() == id);
    }

    // TOTAL DE RECETAS (EXTRA)
    public int totalRecetas() {
        return recetas.size();
    }
}