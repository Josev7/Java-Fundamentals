package Practico07;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Excepciones {
    public static void main(String args[]) {
        //Excepcion de arreglo
        Scanner teclado = new Scanner(System.in);
        int [] arregloEntero = new int[10];
        try {
            int posicion = teclado.nextInt();
            System.out.println("Ingrese un numero");
            System.out.println(arregloEntero[15]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Fuera de rango. La posicion no existe");
        } catch (InputMismatchException ex) {
            System.out.println("Se ingreso un dato invalido");
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error. Contacte a su administrador");
        }

        System.out.println("*** BIENVENIDO ***");
        //Scanner teclado = new Scanner(System.in);

        System.out.println("INGRESE SU NOMBRE: ");
        String nombre = teclado.next();

        System.out.println("INGRESE DNI: ");
        int dni = 0;
        try {
            dni = teclado.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Se ha ingresado mal el dato");
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error");
        } finally {
            teclado = new Scanner(System.in); //teclado queda corrupta apenas ocurre la excepcion, la instancio de nuevo
        }



        int num = -1;
        int suma = 0;
        int contador = 0;

        while (num != 0) {
            System.out.println("INGRESE UN NUMERO");
           //try {      //ERROR!!! investigar loop
                num = teclado.nextInt();
                suma = suma + num;
                if (num != 0) { //Antes, si ingresaba el cero para salir, el contador sumaba uno mas. Ahora NO
                 contador++;
               }
            /*} catch (InputMismatchException ex) {
                System.out.println("Por favor, ingrese un numero!");
            }*/
        }


        //PARA EVITAR LA EXCEPCION USO TRY-CATCH

        try {
            System.out.println("EL PROMEDIO ES: " + suma/contador);

        } catch (ArithmeticException ex) {
            System.out.println("NO se puede realizar esta operación");
        } catch (Exception ex) {
            System.out.println("Ha ocurrido una excepcion: " + ex.getMessage());
            System.out.println("El promedio es 0");
        } finally {
            System.out.println("*** FIN PROGRAMA ***");
        }



    }

}
