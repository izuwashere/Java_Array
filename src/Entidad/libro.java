
package Entidad;


//Definir
public class libro {
    private int sibn;
    private String titulo;   
    private String autor;
    private int numP;
    private int cantidad;
    private long libros;

    //Dar valor, inicializar
    public libro(int sibn, String titulo, String autor, int numP, int cantidad, long libros) {
        this.sibn = sibn;
        this.titulo = titulo;
        this.autor = autor;
        this.numP = numP;
        this.cantidad = cantidad;
        this.libros = libros;
    }

    public libro() {
    }

    //Obtener y guardar información
    public int getSibn() {
        return sibn;
    }

    public void setSibn(int sibn) {
        this.sibn = sibn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumP() {
        return numP;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getLibros() {
        return libros;
    }

    public void setLibros(long libros) {
        this.libros = libros;
    }

    
    
}
