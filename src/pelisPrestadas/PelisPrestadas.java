package src.pelisPrestadas;
import src.clientes.*;
import src.pelis.*;

public class PelisPrestadas {
    private Cliente cliente;
    private Peli peli;
    private int diasPrestados;

    public PelisPrestadas(Cliente cliente, Peli peli, int diasPrestados){
        this.cliente = cliente;
        this.peli = peli;
        this.diasPrestados = diasPrestados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Peli getPeli() {
        return peli;
    }

    public int getDiasPrestados() {
        return diasPrestados;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPeli(Peli peli) {
        this.peli = peli;
    }

    public void setDiasPrestados(int diasPrestados) {
        this.diasPrestados = diasPrestados;
    }

    public String mostrarPeliPrestada(){

        String muestreo = "id Cliente: " + cliente.getId() + " id Película: " + peli.getId() + " Días Prestados: " + diasPrestados;
        return muestreo;
    }

}
