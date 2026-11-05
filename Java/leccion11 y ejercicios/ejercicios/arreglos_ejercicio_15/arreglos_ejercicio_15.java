package arreglos_ejercicio_15;

import java.util.Scanner;

public class arreglos_ejercicio_15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros ordenados:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero: ");
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Ingrese el numero N a buscar: ");
        int N = teclado.nextInt();

        int posicion = -1;

        for (int i = 0; i < 10; i++) {

            if (numeros[i] == N) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("El numero se encuentra en la posicion: " + posicion);
        } else {
            System.out.println("El numero no se encuentra en la tabla.");
        }

        teclado.close();
    }
}
