/*ejercicio 9: pedir el dia, mes y año de una fecha e indicar si la fecha es correcta
suponiendo que todos los meses son de 30 dias*/
package ejercicio9;

import javax.swing.JOptionPane;

public class Ejercicio9JO {
    public static void main(String[] args) {
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
       
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        
        int año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        if((mes != 0)&&(dia <= 30)){
            if((mes != 0)&&(mes <= 12)){
                if((año != 0)&&(año <= 2026)){
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es: "+dia+ "/" +mes+ "/" +año);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, año incorrecto");                 
                }      
                        
            }
            else{
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, mes incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecta, dia incorrecto");
        }
    }
    
}
