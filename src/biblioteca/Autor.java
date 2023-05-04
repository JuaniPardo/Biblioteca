package biblioteca;

public class Autor {
    private String nombre;      //REFERENCIA DE INSTANCIA

    //####SETTERS Y GETTERS####
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor: \t\t" + nombre;
    }
}
