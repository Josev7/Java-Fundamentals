package Practico06;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Colegio {
    public static void main(String args[]) {
        //Creo Objetos
        Scanner input = new Scanner(System.in);
        List<String> listanombres = new ArrayList<>();
        List<Persona> listaPersonas = new ArrayList<>();
        List<Alumno> listaAlumnos = new ArrayList<>();

        Persona profe1 = new Profesor("Gael Elias", 54000123, "Sistemas");
        Persona profe2 = new Profesor("Anais Yandira", 55020999, "Nutrición");

        Persona a1 = new Alumno("Piter Rodriguez", 36600559, "Naturales");
        Persona a2 = new Alumno("Grishi Ovando", 36700555, "Quimica");
        //HUBO UNA MODIFICACION. TODOS A PERSONAS PARA PROBAR POLIMORFISMO

        listaPersonas.add(profe1);
        listaPersonas.add(profe2);
        listaPersonas.add(a1);
        listaPersonas.add(a2);

        //forEach
        for (Persona pers: listaPersonas) {
            System.out.println(pers);
        }
        Administrativo admin1 = new Administrativo("EL BIGO", 99999943);
        System.out.println(admin1);

        System.out.println("INGRESE LA CANTIDAD DE ALUMNOS A CREAR: ");
        int cantidad = input.nextInt();

        /*System.out.println(profe1);
        System.out.println(profe2);
        System.out.println(a1);
        System.out.println(a2);*/

        for (int i = 0; i < cantidad; i++) {
            //Agrego el objeto creado a la lista de Alumnos
            Alumno nuevoAlumno = crearAlumno();
            listaAlumnos.add(nuevoAlumno);
            System.out.println("SE HA INGRESADO UN ALUMNO A LA LISTA DE ALUMNOS.");
            System.out.println(nuevoAlumno);
        }




        if (listaAlumnos.isEmpty() == false) {
            mostrarAlumnos(listaAlumnos);

            System.out.println("DESEA ELIMINAR ALGUN ALUMNO DE LA LISTA? SI-NO");
            String respuesta = input.next();
            if (respuesta.toUpperCase().equals("SI")) {
                System.out.println("INGRESE NRO DE ESTUDIANTE: ");
                int nro = input.nextInt();
                if (nro <= listaAlumnos.size()) {
                    listaAlumnos.remove(nro);
                } else {
                    System.out.println("NO EXISTE EL ALUMNO A ELIMINAR");
                }
            }
            mostrarAlumnos(listaAlumnos);
        } else {
            System.out.println("LA LISTA DE ALUMNOS ESTA VACIA");
        }

    }

    public static void mostrarAlumnos(List<Alumno> lista) {
        System.out.println("********************");
        System.out.println("ALUMNOS DEL SISTEMA: ");
        int posicion = 0;
        for (Alumno alumno : lista) {
            System.out.println(posicion + ": " + alumno);
            posicion++;
        }
        System.out.println("********************");
    }


    public static Alumno crearAlumno() {
        //ARMO LISTA ALUMNOS SIN POLIMORFISMO, SOLO CREO ALUMNOS
        Scanner input = new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE DEL ALUMNO");
        String nombre = input.next();
        System.out.println("INGRESE EL DNI: ");
        int dni = input.nextInt();
        System.out.println("INGRESE EL CURSO");
        String curso = input.next();

        //Creo objeto ALumno
        Alumno alumno = new Alumno(nombre, dni, curso);

        return alumno;
    }
    //TENGO CONSAS EN COMUN CON PROFESOR Y ALUMNO, APLICO HERENCIA.

    //VISIBILIDAD:
    /*
    PRIVATE: Solo la clase puede acceder a los atributos y/o metodos. NO APLICA HERENCIA.
             Solo lo ve la clase padre.
    PUBLIC: todas las clases pueden acceder a los atributos y metodos de una clase

    PROTECTED: igual que private pero aplica visibilidad a la herencia.
               Solo acceden las clases hijas, ninguna otra.
    * */


}
