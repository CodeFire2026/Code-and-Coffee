/*Ejercicio 8: pedir un numero N, y mostrar todos los numeros del 1 an N*/
package ejercicio8;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio8JO {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int i = 1;
        while( i <= numero){
            JOptionPane.showMessageDialog(null, i);
            i++;
        }
    }
}
    
