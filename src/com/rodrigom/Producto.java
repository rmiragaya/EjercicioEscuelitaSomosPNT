package com.rodrigom;

public abstract class Producto implements Comparable<Producto>{
    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getNombre() {
        return this.nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

@Override
    public int compareTo(Producto o) {
        return (this.precio - o.getPrecio());
    }

}
