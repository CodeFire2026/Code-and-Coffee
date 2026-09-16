/*Ejercicio 10: pedir 10 numeros y escribir la suma total
hacerlo con la clase scanner y JOptionPane*/
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10PedirNumeroYEscribirSuma {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 1;
        while (contador <=10){
            System.out.println("Digite un numero: ");
            numero = teclado.nextInt();
            suma = suma + numero;
            contador++;
        }
        System.out.println("La suma de todos los numeros es: " +suma);
    }
}
