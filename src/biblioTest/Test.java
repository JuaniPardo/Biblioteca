package biblioTest;

import biblioteca.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);     //VARIABLE ESTATICA DE CLASE

    //----METODO PRINCIPAL, INVOCADO DESDE EL MAIN----
    public static void mostrarMenu(ArrayList<Prestamo> prestamos,Socio[] socios, Libro[] libros){
        //préstamos, socios y libros son variables objetos locales dentro del método
        //este método no las utiliza, pero las necesita para pasárselas a los otros métodos del menú
        System.out.println( "\u001B[33m" +
                            "1: Ver Libros\n" +
                            "2: Ver Autores\n" +
                            "3: Realizar Préstamo\n" +
                            "4: Realizar Devolución\n" +
                            "5: SALIR\n" +
                            "Seleccione una opción\u001B[0m ");
    }

    //----METODO PARA TERMINAR UN PRESTAMO. SE LLAMA DESDE EL MENU PRINCIPAL----
    public static void hacerDevolucion(ArrayList<Prestamo> prestamos) {
        //prestamos es variable objeto local
        System.out.println("Prestamos en Curso\n-------------------");
        if (prestamos.size()>0) {  //me fijo que el array no esté vacío
            for (int i = 0; i < prestamos.size(); i++) {    //variable primitiva local del bucle. Recorro array
                if (!prestamos.get(i).isFin()) {            //si el prestamo no finalizó
                    System.out.println("Préstamo " + (i + 1) + ":\n" + prestamos.get(i)); //muestro préstamos en curso
                }
            }
            System.out.print("Ingrese número de préstamo a finalizar: ");
            int opcion = (sc.nextInt()-1);                  //variable primitiva local del método
            prestamos.get(opcion).devolucion();             //hago la devolución
        }
    }

    //----METODO PARA INICIAR UN PRESTAMO. SE LLAMA DESDE EL MENU PRINCIPAL----
    public static void hacerPrestamo(ArrayList<Prestamo> prestamos, Socio[] socios, Libro[] libros) {
        //prestamos, socios y libros son var objetos locales del método
        System.out.println("Ingrese número de Socio (1..5)");
        int socio = sc.nextInt()-1;         //variable primitiva local para input de user
        System.out.println("Ingrese número de libro (1..20)");
        int libro = sc.nextInt()-1;         //variable primitiva local para input de usuario
        Prestamo prestamo = new Prestamo(socios[socio],libros[libro],123); //prestamo es var objeto local
        if (!prestamo.isErr()){             //si prestamo no da error
            prestamos.add(prestamo);        //lo sumo a prestamos<>
        }
    }

    //----METODO PARA MOSTRAR LOS AUTORES Y SUS LIBROS. SE LLAMA DESDE MENU PRINCIPAL----
    public static void mostrarAutores(Autor[] autores, Libro[] libros) {
        //autores y libros son var objeto locales del método
        for (int i = 0; i < autores.length; i++) {          //var primitiva local del bucle
            System.out.println(autores[i] + "\n------------------");
            for (int j = 0; j < libros.length; j++) {       //var primitiva local del bucle
                if (autores[i] == libros[j].getAutor()){
                    System.out.println(libros[j].getTitulo());
                    if (libros[j].isDisponibilidad()){
                        System.out.println("Estado: DISPONIBLE");
                    }else {
                        System.out.println("Estado: NO DISPONIBLE");
                    }
                }
            }
            System.out.println("=======================");
        }
    }

    //----METODO QUE PERMITE VER LOS LIBROS DE LA BIBLIOTECA: TOTAL, DISPONIBLES Y PRESTADOS
    public static void menuLibros(ArrayList<Prestamo> prestamos, Socio[] socios, Libro[] libros){
        //prestamos, socios y libros son var objeto locales del metodo
        System.out.print(   "\u001B[34m" +
                            "1: Libros Disponibles\n" +
                            "2: Todos los libros\n" +
                            "3: Ver libros prestados\n" +
                            "4: Menú anterior\n" +
                            "Ingrese su opción: \u001B[0m ");
        int opcion = sc.nextInt();          //var local primitiva para input usuario
        switch (opcion){
            case 1 -> {
                for (int i = 0; i < libros.length; i++) {   //var primitiva local del bucle
                    if (libros[i].isDisponibilidad()){
                        System.out.println("Libro " + (i+1) + "\n---------" + libros[i]);
                        System.out.println("=======================");
                    }
                }
            }
            case 2 -> {
                for (int i = 0; i < libros.length; i++) {   //var primitiva local del bucle
                    System.out.println(libros[i]);
                }
            }
            case 3 -> {
                for (int i = 0; i < libros.length; i++) {   //var primitiva local del bucle
                    if (!libros[i].isDisponibilidad()){
                        System.out.println("Libro " + (i+1) + "\n---------" + libros[i]);
                        System.out.println("=======================");
                    }
                };
            }
            case 4 -> {
                mostrarMenu(prestamos,socios,libros);
            }
        }
    }

    //MAIN______MAIN_____MAIN
    public static void main(String[] args) {

        ArrayList<Prestamo> prestamos = new ArrayList<>();
        Autor[] autores = new Autor[10];            //var objeto local del main
        Libro[] libros = new Libro[20];             //var objeto local del main
        Socio[] socios = new Socio[5];              //var objeto local del main
        Direccion[] direcciones = new Direccion[3]; //var objeto local del main

        direcciones[0] = new Direccion("Calle Falsa", 123, "Springfield");

        //genero autores con nombre genérico
        for (int i = 0; i < autores.length; i++) {      //var primitiva local del bucle
            autores[i] = new Autor();
            autores[i].setNombre("Autor " + (i+1));
        }

        //genero libros con nombre genérico
        for (int i = 0; i < libros.length; i++) {       //var primitiva local del bucle
            libros[i]= new Libro("123","Título "+ (i+1) ,"Sector x",autores[(int)(i/2)]);
        }

        //genero socios con nombre genérico y misma direccion
        for (int i = 0; i < socios.length; i++) {       //var primitiva local del bucle
            socios[i] = new Socio(direcciones[0],i,"Nombre " + i);
        }

        int opcion;         //variable primitiva local del main
        do {
            mostrarMenu(prestamos,socios,libros);
                opcion = sc.nextInt();
                switch (opcion){
                    case 1 -> menuLibros(prestamos,socios,libros);
                    case 2 -> mostrarAutores(autores,libros);
                    case 3 -> hacerPrestamo(prestamos,socios,libros);
                    case 4 -> hacerDevolucion(prestamos);
                    case 5 -> System.out.println("----FIN----FIN----FIN----");
                }
        } while (opcion !=5);

    }
}
