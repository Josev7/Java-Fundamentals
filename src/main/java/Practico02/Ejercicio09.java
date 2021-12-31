package Practico02;

import java.util.Scanner;

public class Ejercicio09 {
    //INICIO
    public static void main(String args[]) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        System.out.println("Ingrese el último número: ");
        num3 = input.nextInt();

        if (num1 == num2) {
            System.out.println("El número repetido es: " + num2);
        }
        if (num1 == num3) {
            System.out.println("El número repetido es: " + num3);
        }
        if (num2 == num3) {
            System.out.println("El número repetido es: " + num3);
        }
    }
    }
