package com.rodrigom;

public class Bebidas extends Producto {
    private double litros;

    public Bebidas(String marca, int precio, double litros) {
        super(marca, precio);
        this.litros = litros;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getPrecio() {
        return super.getPrecio();
    }

    public double getLitros() {
        return litros;
    }

    @Override
    public String toString() {
        return ("Nombre: " + getNombre() +
                " /// Litros: " +  getLitros() +
                " /// Precio: $" + getPrecio());
    }
}
