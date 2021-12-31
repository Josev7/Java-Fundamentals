package Practico03;

import java.awt.*;
import java.util.Scanner;

public class EjercicioMetodo10 {
    public static void main(String args[]) {
        int n = 0;
        int min = 0;
        int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        n = input.nextInt();
        System.out.println("Ingrese el mínimo del rango: ");
        min = input.nextInt();
        System.out.println("Ingrese el máximo del rango: ");
        max = input.nextInt();
        enRango(n, min, max);
    }

    public static void enRango(int n, int min, int max) {
        if (n >= min && n <= max) {
            System.out.println("El número es valido");
        } else {
            System.out.println("El número está fuera de rango");
        }
    }
}
