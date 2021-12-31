package Practico07_objetos;

import java.util.Scanner;

public class JavaUtils {
    public static int solicitarNumero(String unMensaje, int min, int max) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(unMensaje);
        int numero = teclado.nextInt();
        while (numero < min || numero < max) {
            System.out.println("Ingrese un numero entre: " + min + " y " + max);
            numero = teclado.nextInt();
        }

        return numero;
    }

    public static String solicitarTexto(String unMensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(unMensaje);
        String unTexto = teclado.next();
        return unTexto;
    }
}
