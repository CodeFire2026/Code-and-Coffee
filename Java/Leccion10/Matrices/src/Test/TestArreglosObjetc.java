
package Test;

import domain.Persona;


public class TestArreglosObjetc {
    public static void main(String[] args) {
        Persona personas [] = new Persona [2];
        personas [0] = new Persona ("Mateo");
        personas [1] = new Persona ("Santiago");
        System.out.println("personas 0 = " + personas [0]);
        System.out.println("personas 0 = " + personas [1]);
   
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + " = " + personas[i]);
        }
        
        String frutas [] = {"Durazno", "Manzana", "Frutilla"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " + i + " = " + frutas[i]);
            
        }
    }
}
