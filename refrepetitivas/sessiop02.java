package refrepetitivas;

import java.util.Scanner;

/**
 * sessiop02
 */
public class sessiop02 {

    static Scanner leerTScanner=new Scanner(System.in);
    static Scanner lt=new Scanner(System.in);

    public static void fibonaciN() {
        int nI=0, nS=1, nT;
        System.out.println("introduce un numero");
        int n=leerTScanner.nextInt();
        int cont=1; 
        if (n>1) {
            while (cont<n) {
                nT=nS+nI;
                nI=nS;
                nS=nT;
                cont++;
            }
            
        }else{nS=n;}

        System.out.println("el fibonaci de "+n+"es:"+nS);
        
    }

    public static void main(String[] args) {
        fibonaciN();
        
    }
}
