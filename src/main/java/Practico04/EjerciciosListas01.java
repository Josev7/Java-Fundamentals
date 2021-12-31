package Practico04;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjerciciosListas01 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        List<String> listaNombres = new ArrayList<String>();
        listaNombres.add("GAEL");
        listaNombres.add("ELIAS");
        listaNombres.add("MELUNCHINA");
        System.out.println("Lista Vacia?: " + listaNombres.isEmpty());

        imprimirLista(listaNombres);

        //BUSCAR ELEMENTO
        System.out.println("Ingrese un nombre a buscar: ");
        String nombre = input.next();

        if (listaNombres.indexOf(nombre) != -1) {
            System.out.println("El nombre está en la posición: " + listaNombres.indexOf(nombre));
        } else {
            System.out.println("El nombre no EXISTE!");
        }

        System.out.println("Ingrese un nombre a eliminar: ");
        String nombreAEliminar = input.next();
        int posicionDelNombre = listaNombres.indexOf(nombreAEliminar);

        if (posicionDelNombre != -1) {
            System.out.println("El nombre está en la posición: " + posicionDelNombre);
            System.out.println("Eliminando Nombre...");
            listaNombres.remove(posicionDelNombre);
        } else {
            System.out.println("El nombre no existe");
        }

        System.out.println("Ingrese un nombre para agregar a la lista: ");
        String agregarNombre = input.next();
        listaNombres.add(agregarNombre);

        imprimirLista(listaNombres);

    }

    public static void imprimirLista(List<String> listastrings){
        for (int i = 0; i < listastrings.size(); i++) {
            System.out.println("-----> " + listastrings.get(i));
        }
        //return listastrings; //PUEDO TAMBIEN PASARLOS COMO PARAMETRO!
    }
}
