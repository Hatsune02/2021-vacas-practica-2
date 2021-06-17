package src.pelis;

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

    public Peli(int id, String nombre, String categoria){
        this(id, nombre, 0, categoria);
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