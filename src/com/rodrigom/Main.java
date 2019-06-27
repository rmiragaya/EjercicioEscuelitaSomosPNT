package com.rodrigom;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Producto> lista = new ArrayList<>();


        lista.add(new Bebidas("Coca-Cola Zero", 20, 1.5));
        lista.add(new Bebidas("Coca-Cola", 18, 1.5));
        lista.add(new Baño("Shampoo Sedal", 19, 500));
        lista.add(new FrutasyVerduras("Frutillas", 64, "Kilo"));

        //impresion de lista
        imprimirLista(lista);
        System.out.println("=============================");
        //producto Mas Caro
        masCaro(lista);
        //producto Mas Barato
        masBarato(lista);


    }



    public static void imprimirLista(ArrayList<Producto> lista){

        for(Producto p : lista){
            System.out.println(p.toString());
        }
    }

    public static void masCaro(ArrayList<Producto> lista){

        Collections.sort(lista);
        Collections.reverse(lista);
        System.out.println("Producto más caro: " + lista.get(0).getNombre());

    }

    public static void masBarato(ArrayList<Producto> lista){
        Collections.sort(lista);
        System.out.println("Producto más barato: " +lista.get(0).getNombre());

    }


}
