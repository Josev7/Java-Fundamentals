package Practico04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjerciciosListas03 {
    public static void main(String args[]) {
        List<Integer> listaNumeros = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int n = -1;
        while (n != 0) {
            System.out.println("Ingrese un numero: ");
            n = input.nextInt();
            listaNumeros.add(n);
        }

        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println("-----> " + listaNumeros.get(i));
        }
    }
}
