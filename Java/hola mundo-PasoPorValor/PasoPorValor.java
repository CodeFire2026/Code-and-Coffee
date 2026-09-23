
package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var valorx = 20;
        System.out.println("valorX = " + valorx);
        cambioValor(valorx); //solo le enviamos una copia
        System.out.println("valorx = " + valorx);
    }
    
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
}
