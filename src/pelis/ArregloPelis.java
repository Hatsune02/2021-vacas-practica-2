package src.pelis;

import src.tienda.*;

public class ArregloPelis {
    private Peli[] pelis = new Peli[50];
    private int contador;

    public ArregloPelis(){
        contador = 0;
    }

    public void agregarPeli(String nombre, int year, String categoria){
        if(contador >= 50){
            System.out.println("Límite de películas alcanzado");
        }
        else{
            pelis[contador-1] = new Peli((contador + 1), nombre, year, categoria);
            contador++;
        }
    }

    public void agregarPeli(){
        String nombre = IngresoDatos.getString("Ingrese el nombre de la peli");
        int year = IngresoDatos.getInt("Ingrese el año de salida de la peli");
        String categoria = IngresoDatos.getString("Ingresa la categoría de la peli");
        agregarPeli(nombre, year, categoria);
    }

    public void mostrarClientes(){
        System.out.println("\n\nPeliculas de Memorabilia");
        for (int i = 0; i < contador; i++) {
            System.out.println("-" + (i+1) + ") " + pelis[i].mostrarPeli());
        }
        System.out.println("\n\n");
    }

    public void ordenamientoAlfabetico(boolean ascendente){
        boolean cambio = true;

        for (int i = 0; i < (contador - 1); i++) {
            for (int j = 0; j < (contador - 1); j++) {
                if(ascendente){
                    cambio = (pelis[j].getNombre().compareTo(pelis[j+1].getNombre()) > 0);
                }
                else{
                    cambio = (pelis[j].getNombre().compareTo(pelis[j+1].getNombre()) < 0);
                }

                if(cambio){
                    Peli aux = pelis[j];
                    pelis[j] = pelis[j+1];
                    pelis[j+1] = aux;
                }
            }
        }



    }
}