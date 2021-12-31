package Practico04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjerciciosListas05 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String busqueda;
        List<String> nombres = new ArrayList<String>();
        nombres.add("GAEL");
        nombres.add("ELIAS");
        nombres.add("MELUNCHIS");
        nombres.add("BENJA");

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("--->Nombre: " + i + ": " + nombres.get(i));
        }

        System.out.println("Ingrese un nombre a buscar: ");
            busqueda = input.next();
            if (nombres.indexOf(busqueda) == -1) {
                System.out.println("La persona no se encuentra en la lista");
            } else {
                System.out.println("El elemento se encuentra en la posición: " + nombres.indexOf(busqueda));
            }

    }
}
