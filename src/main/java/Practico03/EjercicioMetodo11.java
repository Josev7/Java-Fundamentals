package Practico03;

import java.util.Scanner;

public class EjercicioMetodo11 {
    public static void main(String args[]) {
        int x = 0;
        int y = 0;
        int z = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el lado 1 del triangulo: ");
        x = input.nextInt();
        System.out.println("Ingrese el lado 2 del triangulo: ");
        y = input.nextInt();
        System.out.println("Ingrese el lado 3 del triangulo: ");
        z = input.nextInt();
        tipoTriangulo(x, y, z);
    }
    public static void tipoTriangulo(int lado1, int lado2, int lado3) {
        if ((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)) {
            System.out.println("El triangulo es equilátero");
        } else if ((lado1 == lado2) || (lado1 == lado2) || (lado2 == lado3)) {
            System.out.println("El triangulo es isóceles");
        } else {
            System.out.println("El triangulo es escaleno");
        }

    }
}
