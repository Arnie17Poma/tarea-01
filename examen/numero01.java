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
        Double n1, n2, n3, promedio;
        String estado;
        //datos de entrada
        System.out.println("ingrese nota 1:");
        n1=leerteclado.nextDouble();
        System.out.println("ingrerse nota 2:");
        n2=leerteclado.nextDouble();
        System.out.println("ingrese nota 3:");
        n3=leerteclado.nextDouble();
        //proceso
        promedio=n1*0.02+n2*0.03+n3*0.05;
        /*
        >=18 y <=20 aprobo con excelencia
        <18 y > >15 aprobo con mencion regular
        <=15 y >=13 aprobo con mencion baja
        <12 desapobrado
        */
        if (promedio>=18 && promedio<=20) {
            estado="aprobo con mencion excelente";

        }else if (promedio<18 && promedio>15) {
            estado="aprobo con mencion regular";

        }else if (promedio<=15 && promedio>=13) {
            estado="aprobo pa las justas";
        }else  {
            estado="desaprobado";
        }
        //datos de salida
        System.out.println(estado);

    }

    public static void main(String[] args) {
        
    }

}