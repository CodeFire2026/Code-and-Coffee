/*Ejercicio 10: pedir 10 numeros y escribir la suma total
hacerlo con la clase scanner y JOptionPane*/
package ejercicio10;

import javax.swing.JOptionPane;


public class Ejercicio10JOptionPane {
    public static void main(String[] args) {
        int numero;
        int suma = 0;
        int contador = 1;
        while (contador <=10){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            suma = suma + numero;
            contador++;
        }
            JOptionPane.showMessageDialog(null, "La suma de todos los numeros es: "+ suma);
    }
}
