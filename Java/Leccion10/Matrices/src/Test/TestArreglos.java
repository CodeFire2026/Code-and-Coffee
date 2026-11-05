
package Test;

public class TestArreglos {
    public static void main(String[] args) { //Se instancia un objeto de tipo object del lado derec.
        int edades [] = new int [3]; //Se declara la vgariable del lado izq.
        System.out.println("edades = " + edades);
        
        edades [0] = 17;
        System.out.println("edades 0 = " + edades [0]);
        
        edades [1] = 14;
        System.out.println("edades 1 = " + edades [1]);
        
        edades [2] = 26;
        System.out.println("edades 2 = " + edades[2]);
        
        //edades [3] = 7 Esto daria error por tiempo de ejecucuion
        
        for (int i = 0; i < edades.length; i++){
            System.out.println("edades y sus elementos = " + i + ": " + edades[i]);
            
        }
    }
}