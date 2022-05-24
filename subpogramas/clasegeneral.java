package subpogramas;

import subpogramas.aritmetica;
/**
 * clasegeneral
 */
public class clasegeneral {

    public static void main(String[] args) {
        aritmetica a=new aritmetica();
        int resultado=a.sumar(5, 3);
        System.out.println("suma: "+resultado);

        aritmetica obj=new aritmetica(5,3);
        resultado=obj.multiplicar();
        System.out.println("multiplicacion: "+resultado);
    }
}