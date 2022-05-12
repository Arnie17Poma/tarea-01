package repetitivas;

import java.util.Scanner;

/**
 * ejercicio4R
 */
public class ejercicio4R {
      
    
    public static void nombrevertical() {
        Scanner it=new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre=it.next();

        for (int i = nombre.length()-1; i >=0;i--) {
            System.out.println(nombre.charAt(i));

        }
        
    }
    


     public static void main(String[] args) {

        /*System.out.println("inprimir while"); inprimirwhileN1_10();
        System.out.println("imprimir do while");inprimirDowhileN1_20();
        System.out.println("inprimir for");inprimirForN1_20();*/

        nombrevertical();
     }
}