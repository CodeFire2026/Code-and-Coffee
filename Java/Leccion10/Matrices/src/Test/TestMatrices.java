package Test;

import domain.Persona;

class TestMatrices {
    public static void main(String[] args) {
        
        // Matriz de enteros
        int[][] edades = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 12;
        edades[0][1] = 8;
        edades[1][0] = 9;
        edades[1][1] = 16;
        edades[2][0] = 4;
        edades[2][1] = 10;
        
        System.out.println("edades 0-0 " + edades[0][0]);
        System.out.println("edades 0-1 " + edades[0][1]);
        System.out.println("edades 1-0 " + edades[1][0]);
        System.out.println("edades 1-1 " + edades[1][1]);
        System.out.println("edades 2-0 " + edades[2][0]);
        System.out.println("edades 2-1 " + edades[2][1]);
        
        // Recorrido de la matriz edades
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades " + fila + "-" + col + ": " + edades[fila][col]);
            }
        }
        //Sintaxis clasica
        //String frutas [] [] = new string [3] [2];        
        
        // Sintaxis simplificada 
        String[][] frutas = {{"Durazno", "Sandia"},{"Naranja", "Banana"},{"Frutilla", "Cereza"}};
        imprimir(frutas);
      //  for (int i = 0; i < frutas.length; i++) {
      //    for (int f = 0; f < frutas[i].length; f++) {
      //         System.out.println("frutas " + i + "-" + f + ": " + frutas[i][f]);
      //      }
      //  }
        
        //Matriz de objetos
        Persona personas [] [] = new Persona [2] [3];
        
        //Asignamos valores a la matriz
        personas [0] [0] = new Persona("Mateo");
        personas [0] [1] = new Persona ("Santiago");
        personas [0] [2] = new Persona ("Bruno");
        personas [1] [0] = new Persona ("Noelia");
        personas [1] [1] = new Persona ("Matias");
        personas [1] [2] = new Persona ("Valentin");
        System.out.println("Matriz de Personas: ");
        imprimir(personas);
    }
    
    
    public static void imprimir (Object matriz [] []) {
        for (int i = 0; i < matriz.length; i++) {
            for (int f = 0; f < matriz[i].length; f++) {
                System.out.println("matriz " + i + "-" + f + ": " + matriz[i][f]);
            }
        }
    }
}
