package src.pelisPrestadas;
import src.clientes.*;
import src.pelis.*;
import src.tienda.*;

public class ArregloPelisPrestadas {
    private PelisPrestadas[] pelisPrestadas = new PelisPrestadas[50];
    private int contador;

    public ArregloPelisPrestadas(){
        contador = 0;
    }

    public void agregarPeli(Cliente cliente, Peli peli, int diasPrestados){
        if(contador >= 50){
            System.out.println("Límite de películas alcanzado");
        }
        else{
            pelisPrestadas[contador] = new PelisPrestadas(cliente, peli, diasPrestados);
            contador++;
        }
    }

    public void prestarPeli(Cliente[] clientes, Peli[] pelis, int contadorPelis, int contadorClientes){
        
        
        int idCliente = IngresoDatos.getEntero("Ingrese el id del cliente ", false);
        int idPeli = IngresoDatos.getEntero("Ingrese el id de la película ", false);
        int diasPrestados = IngresoDatos.getEntero("Ingrese días que se prestará la película " , false);
        Cliente cliente = null;
        Peli peli = null;
        boolean encontrado = false;
        boolean encontrado1 = false;

        for (int i = 0; i < contadorPelis; i++) {
            if(idPeli == pelis[i].getId()){
                peli = pelis[i];
                pelis[i].prestamoPeli();
                encontrado = true;
                break;
            }
        }

        for (int i = 0; i < contadorClientes; i++) {
            if(idCliente == clientes[i].getId()){
                cliente = clientes[i];
                encontrado1 = true;
                break;
            }
        }

        if(encontrado && encontrado1){
            agregarPeli(cliente, peli, diasPrestados);
            System.out.println("Se ha prestado la película con éxito");
        }
        else if(!encontrado && encontrado1){
            System.out.println("No se ha encontrado el id de la película");
        }
        else if(encontrado && !encontrado1){
            System.out.println("No se ha encontrado el id del cliente");
        }
        else{
            System.out.println("No se ha encontrado el id del cliente ni de la película");
        }
        
        System.out.println("\n");
    }

    public void eliminarPeli(int posicion){
        for (int i = 0; i < contador; i++) {
            if(i >= (posicion - 1)){
                pelisPrestadas[i] = pelisPrestadas[i+1];
            }
            
        }
        contador--;
    }

    public void mostrarPeliPrestada(){
        System.out.println("\n\nPeliculas de Memorabilia");
        for (int i = 0; i < contador; i++) {
            System.out.println("-" + (i+1) + ") " + pelisPrestadas[i].mostrarPeliPrestada());
        }
        System.out.println("\n\n");
    }

    public PelisPrestadas[] getPelisPrestadas() {
        return pelisPrestadas;
    }

    public int getContador() {
        return contador;
    }
}
