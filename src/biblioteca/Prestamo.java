package biblioteca;

public class Prestamo {

    private Socio socio;    //REFERENCIA DE INSTANCIA
    private Libro libro;    //VAR REFERENCIA DE INSTANCIA
    private int fecha;      //PRIMITIVA DE INSTANCIA
    private boolean err;    //PRIMITIVA DE INSTANCIA
    private boolean fin;    //PRIMITIVA DE INSTANCIA (variable para saber si el prestamo esta vigente)


    //####SETTERS Y GETTERS####
    public boolean isFin() {
        return fin;
    }               

    public void setFin(boolean fin) {
        this.fin = fin;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public boolean isErr() {
        return err;
    }

    //CONSTRUCTOR
    public Prestamo(Socio socio, Libro libro, int fecha) {
        err = false;
        if (socio.getCantPrestamos()<10 && libro.isDisponibilidad()) {
            this.socio = socio;
            this.libro = libro;
            this.fecha = fecha;
            libro.setDisponibilidad(false);
            socio.setCantPrestamos(socio.getCantPrestamos()+1);
            System.out.println( "\u001B[32mPréstamo Exitoso\u001B[0m");
        } else {
            System.out.println("\033[1m\u001B[31mEl préstamo no se puede realizar\u001B[0m\033[0m\t");
            err = true;
        }
    }
    public void devolucion(){
        libro.setDisponibilidad(true);
        socio.setCantPrestamos(socio.getCantPrestamos()-1);
        fin = true;
        System.out.println("\u001B[32mDevolución Exitosa\u001B[0m");
    }

    @Override
    public String toString() {
        return socio.getNombre() + " tiene el libro " + libro.getTitulo();

    }
}
