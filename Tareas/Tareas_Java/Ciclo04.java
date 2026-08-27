
package ciclo04;

//ejercicio 4: pedir numeros hasta que se teclee uno negativo, 
//y mostrar cuantos numeros se han introducido. 
//y lo hacemos primero con la clase scanner 
//luego lo hacemos con la clase joptionpane


import java.util.Scanner;

public class Ciclo04 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese un numero: ");
        var numero = Integer.parseInt(entrada.nextLine());
        
        int contador = 0;
        
        while(numero >= 0) {
        
        contador++;
        
        System.out.println("ingrese otro numero: ");
        numero = Integer.parseInt(entrada.nextLine());
       
        }
       
        System.out.println("los numeros ingresados son: "+contador);
        
                
        System.out.println("el programa se ha detenido al ingresar un numero negativo");
    }
    
}


