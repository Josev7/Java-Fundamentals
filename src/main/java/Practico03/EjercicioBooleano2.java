package Practico03;

import java.util.Scanner;

public class EjercicioBooleano2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese números hasta ingresar 0");
        int num = -1;

        while (num != 0) {
            System.out.println("Ingrese un numero: ");
            num = input.nextInt();
            if (num == 0) {
                System.out.println("Ha ingresado un cero, el programa finalizará");
            }
        }
    }
}
