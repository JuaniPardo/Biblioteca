package biblioteca;

public class Libro {

    private String isbn;            //VAR REFERENCIA DE INSTANCIA
    private String titulo;          //VAR REFERENCIA DE INSTANCIA
    private Autor autor;            //VAR REFERENCIA DE INSTANCIA
    private boolean disponibilidad; //VAR PRIMITIVA DE INSTANCIA
    private String sector;          //VAR REFERENCIA DE INSTANCIA

    //####SETTERS Y GETTERS####
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    //CONSTRUCTOR
    public Libro(String isbn, String titulo, String sector ,Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.sector = sector;
        disponibilidad = true;
    }

    @Override
    public String toString() {
        if (disponibilidad){
            return "\n\u001B[34mTitulo: \t" + titulo + "\n" +
                    autor + "\n" +
                    "Sector: \t" + sector +
                    "\nEstado: \u001B[0m\t\u001B[32mDISPONIBLE\u001B[0m";
        } else {
            return  "\n\u001B[34mTitulo: \t" + titulo +
                    "\n" + autor + "\n" +
                    "Sector: \t" + sector +
                    "\nEstado: \u001B[0m\t\u001B[31mNO DISPONIBLE\u001B[0m";
        }

    }
}
