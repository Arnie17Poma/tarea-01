PACKAGE POMA;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ejercicomulti {

    public static void profesor() {
        System.out.println("ensenar");
    }
    public static void alumno() {
        System.out.println("aprender o estudiar");         
    }
    public static void maquinaPC() {
        System.out.println("procesar la informacion");   
    }
    public static void proyecto() {
        System.out.println("mostar la informacion");
    }
    public static void main(String[] args) {
        ejercicomulti obj=new ejercicomulti();
        Scanner it=new Scanner(System.in);
        System.out.println("ingrese el numero de algoritmo:\nl:=profesor\n2=estudiante"+"\n3=maquinaPC\n4=proyecto");
        int opcionMet=it.nextInt(); 

        switch (opcionMet) {
            case 1: obj:profesor();break;
            case 2: obj:estudiante();break;
            case 3: maquinaPC();break;
            case 4: proyecto();break;

            default:System.out.println("esa opcion no existe");break;
            
        }

     
     
    }
}
