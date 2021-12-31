package Practico02;

import java.util.Scanner;

public class Ejercicio13 {
    public static void  main(String args[]) {
        int desde = 0;
        int hasta = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número desde donde quiere mostrar: ");
        desde = input.nextInt();
        System.out.println("Ingrese el número hasta donde quiere mostrar");
        hasta = input.nextInt();

        for (int i = desde; i <= hasta; i++) {
            System.out.println("El número actual es: " + i);
        }
    }
}
