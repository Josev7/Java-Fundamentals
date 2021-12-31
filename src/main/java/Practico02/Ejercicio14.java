package Practico02;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String args[]) {
        int num = 0;
        int suma = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        num = input.nextInt();
        suma = num;

        while (num != 0) {
            suma = suma + num;
            System.out.println("Ingrese un número: ");
            num = input.nextInt();
            System.out.println("La suma actual de los nros ingresados es: " + suma);
        }
    }
}
