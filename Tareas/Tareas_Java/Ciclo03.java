
package ciclo03;

//ejercicio 3
//leer numeros hasta que se introduzca un cero
//para cada uno indicar si es par o impar
//primero lo hacemos con la clase scanner
//luego lo hacemos con la clase joptionpane

import java.util.Scanner;

public class Ciclo03 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        var numero = Integer.parseInt(entrada.nextLine());
        
        while(numero != 0){
            
        if(numero % 2 == 0){
            
            System.out.println("el numero "+numero+" es par");
            }
        else{
            System.out.println("el numero es "+numero+" es impar");
        }
        System.out.println("ingrese otro numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        
        
        
    }
   System.out.println("el pograma ha finalizado al poner el numero: "+numero+"");
}
    
}