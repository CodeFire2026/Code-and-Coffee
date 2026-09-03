//ejercicio 6 pedir numeros hasta que se teclee 0, 
//mostrar la suma de todo los numeros introducidos
package ciclo06;

import java.util.Scanner;

public class Ciclo06 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       int suma = 0;
        System.out.println("ingrese un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        
        suma = suma + numero;
        
     
        while (numero !=  0) {
            
             System.out.println("ingrese otro numero: ");
             numero = Integer.parseInt(entrada.nextLine());
            suma = suma + numero;
            
         }
                System.out.println("la suma de numeros en totales es:" + suma);
                System.out.println("programa terminado al ingresar el numero 0");
                
                  
        }
    
    }
    

