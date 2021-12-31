package Practico03;

import java.util.Scanner;

public class EjercicioMetodo09 {
    public static void main(String args[]) {
        double salario = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su salario: ");
        salario = input.nextDouble();
        convertidorSalario(salario);
    }

    public static void convertidorSalario(double pesos) {
        double dolar = pesos / 42;
        double euro = pesos / 50;
        System.out.println("Su salario equivale a : " + dolar + " dolares y a: " + euro + " euros");
    }
}
