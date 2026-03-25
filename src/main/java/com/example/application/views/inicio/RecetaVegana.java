package com.example.application.views.inicio;


public class RecetaVegana extends Receta {

    public RecetaVegana(int id, String nombre, String origen,int tiempo ) {
        super(id, nombre, origen, tiempo);
    }

    @Override
    public String getCategoria() {
        return "Vegana";
    }

}
