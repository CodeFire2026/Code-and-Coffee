package arreglos_ejercicio_13;

import java.util.Scanner;

public class arreglos_ejercicio_13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] resultado = new int[10];

        System.out.println("Ingrese 10 numeros enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero: ");
            numeros[i] = teclado.nextInt();
        }

        int j = 0;

        // Primero guardamos los numeros pares
        for (int i = 0; i < 10; i++) {

            if (numeros[i] % 2 == 0) {
                resultado[j] = numeros[i];
                j++;
            }
        }

        // Despues guardamos los numeros impares
        for (int i = 0; i < 10; i++) {

            if (numeros[i] % 2 != 0) {
                resultado[j] = numeros[i];
                j++;
            }
        }

        System.out.println("Tabla con pares e impares:");

        for (int i = 0; i < 10; i++) {
            System.out.println(resultado[i]);
        }

        teclado.close();
    }
}