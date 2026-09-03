//ejercicio 6 pedir numeros hasta que se teclee 0, 
//mostrar la suma de todo los numeros introducidos

package ciclo06op;

import javax.swing.JOptionPane;

public class Ciclo06OP {

    public static void main(String[] args) {

        int suma = 0;

        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese un número:")
        );

        suma = suma + numero;

        while (numero != 0) {

            numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese otro número:")
            );

            suma = suma + numero;
        }

        JOptionPane.showMessageDialog(
            null,
            "La suma de números es: " + suma
        );

        JOptionPane.showMessageDialog(
            null,
            "Programa terminado al ingresar el número 0"
        );
    }
}