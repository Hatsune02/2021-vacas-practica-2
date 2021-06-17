package src.pelis;

import src.tienda.*;

public class Peli{
    private int id;
    private String nombre;
    private int year;
    private String categoria;
    private boolean disponible;

    public Peli(int id, String nombre, int year, String categoria){
        this.id = id;
        this.nombre = nombre;
        this.year = year;
        this.categoria = categoria;
        disponible = true;
    }

    public Peli(){
        this.id = IngresoDatos.getInt("Ingrese el Id de la Peli");
        this.nombre = IngresoDatos.getString("Ingrese el nombre de la peli");
        this.year = IngresoDatos.getInt("Ingrese el año de salida de la peli");
        this.categoria = IngresoDatos.getString("Ingresa la categoría de la peli");
        disponible = true;
    }

    //GETTERS SETTERS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getYear() {
        return year;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    //  GETTERS SETTERS FINAL

    public void prestamoPeli(){
        this.disponible = false;
    }

    public void devolucionPeli(){
        this.disponible = true;
    }

    public String mostrarPeli(){
        String estado;
        if(disponible){
            estado = "Si";
        }
        else{
            estado = "No";
        }
        String muestreo = "id: " + id + " Nombre pelicula: " + nombre + " Año : " + year + " Categoría: " + categoria + "Disponible: " + estado;
        return muestreo;
    }
       
}