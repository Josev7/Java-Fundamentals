package Practico04;

import java.util.ArrayList;
import java.util.List;

public class EjerciciosListas04 {
    public static void main(String args[]) {
        List<String> lista = new ArrayList<String>();
        List<Integer> listaNumerica = new ArrayList<Integer>();

        /*lista.add("PP");
        lista.add("GAEL");
        lista.add("Melunchina");
        listaNumerica.add(2);
        */
        esVacia(lista);
    }
    public static void esVacia(List<String> listaStrings) {
        if (listaStrings.isEmpty() == true) {
            System.out.println("La lista está vacia");
        } else {
            System.out.println("La lista contiene elementos");
        }
    }
}
