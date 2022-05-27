package refrepetitivas;

import java.util.Scanner;

/**
 * primo
 */
public class primo {
    static Scanner leerT=new Scanner(System.in);
    public static void numeroprimo() {
        System.out.println("ingrese el limite:");
        int num=leerT.nextInt();
        int numx=1;
        while (numx<=num) {
            int cantDiv=0;
            int cont=1;      
            while (cont<=numx) {
                if (cantDiv>2) break;
                if (num%cont==0) {
                    cantDiv++;
                }   
                cont++;         
            }
            if (cantDiv==2) {
                System.out.println(numx);
            }
            numx=numx+1;
        }
    }
    
    public static void main(String[] args) {
        numeroprimo();
        
    }
}