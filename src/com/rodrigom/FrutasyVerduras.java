package com.rodrigom;

public class FrutasyVerduras extends Producto{
    private String unidaDeVenta;

    public FrutasyVerduras(String marca, int precio, String unidaDeVenta) {
        super(marca, precio);
        this.unidaDeVenta = unidaDeVenta;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getPrecio() {
        return super.getPrecio();
    }

    public String getUnidaDeVenta() {
        return unidaDeVenta;
    }

    @Override
    public String toString() {
        return ("Nombre: " + getNombre() +
                " /// Precio: $" +  getPrecio() +
                " /// Unidad de venta: " +  getUnidaDeVenta());
    }
}
