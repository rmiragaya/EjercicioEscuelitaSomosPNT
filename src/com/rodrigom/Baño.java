package com.rodrigom;

public class Baño extends Producto{
    private int contenido;

    public Baño(String marca, int precio, int contenido) {
        super(marca, precio);
        this.contenido = contenido;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getPrecio() {
        return super.getPrecio();
    }

    public int getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return ("Nombre: " + getNombre() +
                " /// Contenido: " +  getContenido() +
                "ml /// Precio: $" +  getPrecio());
    }
}
