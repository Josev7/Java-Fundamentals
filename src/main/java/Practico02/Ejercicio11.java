package Practico02;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String args[]) {
        int num = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num = input.nextInt();

        while (num >= 0) {
            System.out.println("Ingrese otro número");
            num = input.nextInt();
        }
    }
}

