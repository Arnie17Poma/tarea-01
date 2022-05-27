package refrepetitivas;

import java.util.Scanner;

/**
 * primo
 */
public class primo {
    static Scanner leerTScanner=new Scanner(System.in);
    public static void numeroprimo() {
        System.out.println("ingrese el numero limite:");
        int num=leerTScanner.nextInt();
        int cont=1;
        int cantDiv=0;
        int numx=1;
        while (numx<=num) {
            if (cantDiv==2) {
                System.out.println("num");
            }
        }
        while (cont<=num) {
            if (num%cont==0) {
                cantDiv++;
            }   
            cont++;         
        }
        if (cantDiv==2) {
            System.out.println(+num+" es primo");
        }else{
            System.out.println("el numero "+num+" no es primo");
        }
    }

    public static void main(String[] args) {
        numeroprimo();
        
    }
}