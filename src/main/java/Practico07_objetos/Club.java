package Practico07_objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Club {
    public static void main(String args[]){
        List<Futbolista> listaFutbolistas= new ArrayList<>();

        System.out.println("*** BIENVENIDOS ***");

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            String nombre = JavaUtils.solicitarTexto("Ingrese el nombre: ");
            String posicion = JavaUtils.solicitarTexto("Ingrese la posición: ");
            int dni = JavaUtils.solicitarNumero("Ingrese el dni: ", 1500000, 7000000);

            Futbolista futbolista = new Futbolista(dni, nombre, posicion);
            System.out.println("Se ha creado un futbolista ");

            listaFutbolistas.add(futbolista);
        }

        System.out.println("LISTA DE FUTBOLISTAS: ");
        for (Futbolista fut : listaFutbolistas) {
            System.out.println(fut);
        }

    }
}
