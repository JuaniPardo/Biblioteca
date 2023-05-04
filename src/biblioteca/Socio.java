package biblioteca;

public class Socio {

    private Direccion direccion;    //VAR REFERENCIA DE INSTANCIA
    private int id;                 //PRIMITIVA DE INSTANCIA
    private String nombre;          //PRIMITIVA DE INSTANCIA
    private int cantPrestamos;      //PRIMITIVA DE INSTNACIA

    //####SETTERS Y GETTERS#####


    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPrestamos() {
        return cantPrestamos;
    }

    public void setCantPrestamos(int cantPrestamos) {
        this.cantPrestamos = cantPrestamos;
    }

    public Socio(Direccion direccion, int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        cantPrestamos = 0;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Socio " +id +
                "\nNombre: \t" + nombre +
                "\nPrestamos: \t" + cantPrestamos ;
    }
}
