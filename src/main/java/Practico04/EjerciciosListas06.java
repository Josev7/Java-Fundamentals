package Practico04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjerciciosListas06 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int hastaN = 0;
        List<String> listaNumeros = new ArrayList<String>();
        System.out.println("Ingrese hasta que numero quiere armar la lista: ");
            

        //imprimirListaEnteros(listaNumeros);
    }
    public static void imprimirListaEnteros(ArrayList<String> listaNum) {
        for (int i = 0; i < listaNum.size(); i++) {
            System.out.println("-> " + listaNum.get(i));
        }
    }
}
