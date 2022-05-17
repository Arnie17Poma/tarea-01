package avancesdeclases;

import java.util.Scanner;

/**
 * ejercicio18
 */
public class ejercicio18 {
    
        static Scanner lt=new Scanner(System.in);
 
        public static void impuestos() {

            //definir variables
            String cateV="";
            int cantidad=0;
            double costV=0, impUnil=0, impTotal=0, totalImpV=0;
            //datos de entrada
            for (int i= 0; i < 3; i++) {
                System.out.println("ingrese cantidad vehiculos de categoria "+ (i+1)+":");
                cantidad=lt.nextInt();
                System.out.println("Ingrese el precio de la categoria" +(i+1)+":");
                costV=lt.nextDouble();
                if (i==1) {
                    impUnil=costV*0.10;
                    impTotal=impUnil*cantidad;
                }else if(i==2){
                    impUnil=costV*0.07;
                }else {
                    impUnil=costV*0.5;
                }
                impTotal=impUnil*cantidad;
                System.out.println("impuesto de categoria "+(i+1)+" es:"+impUnil);
                System.out.println("impuesto total de categoria "+(i+1)+"es:"+impTotal);
                totalImpV=totalImpV+impTotal;
            }
            System.out.println("impuesto total de los vehiculos es :"+totalImpV);
        
    }

    public static void main(String[] args) {
        impuestos();
    }
}