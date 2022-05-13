package examen;

import java.util.Scanner;

/**
 * numero02
 */
public class numero02 {
     //cometario
    static Scanner leerteclado=new Scanner(System.in);

    public static void pregunta02() {
        //definir variables
        Double precio, descuento, igv, total, pf;
        //datos de entrada
        System.out.println("precio del articulo");
        precio=leerteclado.nextDouble();
        //proceso
        if (precio>=2000) {
            descuento=precio*0.10;
        }else if (precio>=1000 && precio<1000) {
            descuento=precio*0.5;
        }else if (precio>=500 && precio<1000){
            descuento=precio*0.2;
        }else{
            descuento=precio*0;
        }
        total=precio*descuento;
        igv=total*0.10;
        pf=total*igv;
        //datos de salida
        System.out.println("el igv total es: "+igv);
        System.out.println("el descuento total es: "+descuento);
        System.out.println("el total a pagar es: "+pf);

    }
    public static void main(String[] args) {
        pregunta02();
    }
}

