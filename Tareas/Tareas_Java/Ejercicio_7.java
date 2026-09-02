/*Ejercicio 7: pedir numeros hasta que se introduzca uno negativo y calcular 
la media*/
package EjerciciosJava;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        int suma = 0;
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0){
            System.out.println("El numero " +numero+ " es POSITIVO");
            suma = suma + numero;
            conteo++;
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if (conteo > 0){
            double media = (double)suma/conteo;
            System.out.println("La media es: " +media);
           }
        }
                
    }
