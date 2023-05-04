package biblioteca;

public class Direccion {
    private String calle;           //VAR PRIMITIVA DE INSTANCIA
    private int num;                //VAR PRIMITIVA DE INSTANCIA
    private String provincia;       //VAR PRIMITIVA DE INSTANCIA

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public void mostrarInfoDireccion() {
        System.out.println("Dirección: " + calle + " " + num + ", " + provincia);
    }

    //Constructor

    public Direccion(String calle, int num, String provincia) {
        this.calle = calle;
        this.num = num;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Direccion: \t" + calle + num +
                ", " + provincia;
    }
}