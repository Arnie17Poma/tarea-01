package examen;

import java.util.Scanner;

/**
 * numero01
 */
public class numero01 {
    //cometario
    static Scanner leerteclado=new Scanner(System.in);

    public static void pregunta01() {
        //definir variables
        double n1, n2, n3, promedio;
        String estado;
        //datos de entrada
        System.out.println("ingrese nota 1:");
        n1=leerteclado.nextDouble();
        System.out.println("ingrese nota 2:");
        n2=leerteclado.nextDouble();
        System.out.println("ingrese nota 3:");
        n3=leerteclado.nextDouble();
        //proceso
        promedio=n1*0.40+n2*0.350+n3*0.250;
        /*
        >=18 y <=20 aprobo con excelencia
        <18 y > >15 aprobo con mencion regular
        <=15 y >=13 aprobo con mencion baja
        <12 desapobrado
        */
        if (promedio>=17 && promedio<=20) {
            estado="nivel 4";
            

        }else if (promedio<17 && promedio>=14) {
            estado="nivel 3";
            

        }else if (promedio<14 && promedio>=11) {
            estado="nivel 2";
            
        }else{
            estado="desaprobado";
            
        }
        //datos de salida
        System.out.println(estado);

    }
    

    public static void main(String[] args) {
        pregunta01();
    }

}