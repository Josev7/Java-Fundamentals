package Practico02;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String args[]) {
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("El numero actual es: " + i);
        }
    }
}