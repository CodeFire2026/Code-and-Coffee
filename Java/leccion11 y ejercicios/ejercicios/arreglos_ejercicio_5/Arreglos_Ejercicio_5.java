package arreglos_ejercicio_5;

import java.util.Scanner;

public class Arreglos_Ejercicio_5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        System.out.println("Ingrese los 10 numeros del arreglo A:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero: ");
            A[i] = teclado.nextInt();
        }

        System.out.println("Ingrese los 10 numeros del arreglo B:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero: ");
            B[i] = teclado.nextInt();
        }

        int j = 0;

        for (int i = 0; i < 10; i++) {
            C[j] = A[i];
            C[j + 1] = B[i];

            j = j + 2;
        }

        System.out.println("Arreglo mezclado:");

        for (int i = 0; i < 20; i++) {
            System.out.println(C[i]);
        }

        teclado.close();
    }
}