package src.tienda;

import src.clientes.*;
import src.pelis.*;
import src.pelisPrestadas.*;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private ArregloPelis tablaPelis = new ArregloPelis();
    private ArregloPelisPrestadas tablaPelisPrestadas = new ArregloPelisPrestadas();

    public Principal(){
        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Opciones Película");
            System.out.println("2) Opciones Cliente");
            System.out.println("3) Opciones Prestamo y Devolución Películas");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                menuPelis();
            }
            if (menu == 2){
                menuClientes();
            }
            if (menu == 3){
                menuPelisPrestadas();
            }

        }



    }

    public void menuClientes(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia <<CLIENTES>>\n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                //ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 2){
                //mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 3){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }

        }

    }

    public void menuPelis(){
        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia <<PELÍCULAS>>\n\n");
            System.out.println("1) Ingreso de películas");
            System.out.println("2) Mostrar películas");
            System.out.println("3) Ordenar Películas Ascente");
            System.out.println("4) Ordenar Películas Descendente");
            System.out.println("5) Modificar Película");
            System.out.println("6) Eliminar Película");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                tablaPelis.agregarPeli();
            }
            if (menu == 2){
                tablaPelis.mostrarPelis();
            }
            if (menu == 3){
                System.out.println("Desordenado:");
                tablaPelis.mostrarPelis();
                System.out.println("\n\nOrdenado:");
                tablaPelis.ordenamientoId(true);
                tablaPelis.mostrarPelis();
            }
            if (menu == 4){
                System.out.println("Desordenado:");
                tablaPelis.mostrarPelis();
                System.out.println("\n\nOrdenado:");
                tablaPelis.ordenamientoId(false);
                tablaPelis.mostrarPelis();
            }
            if (menu == 5){
                tablaPelis.modificarPelis();
            }
            if (menu == 6){
                tablaPelis.eliminarPeli();
            }

        }

    }

    public void menuPelisPrestadas(){
        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia <<PRÉSTAMO>>\n\n");
            System.out.println("1) Prestar película");
            System.out.println("2) Mostrar Películas Prestadas");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                tablaPelisPrestadas.prestarPeli(tablaClientes.getClientes(), tablaPelis.getPelis(), tablaPelis.getContador(), (tablaClientes.getSiguienteCodigo()-1));
            }
            if (menu == 2){
                tablaPelisPrestadas.mostrarPeliPrestada();
            }

        }
    }
    
}
