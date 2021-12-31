package Practico02;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String args[]) {
        int num = 0;
        int es = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("El número ingresado es positivo");
        } else {
            System.out.println("El numero ingresado es cero o negativo");
        }

    }
}
