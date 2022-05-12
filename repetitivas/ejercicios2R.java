package repetitivas;

/**
 * 
 */
public class ejercicios2R {

    public static void imprimirdowhileN1_20(String[] args) {
        int numIint=1;
        while (numIint<=21) {
            System.out.println(numIint);
            numIint=numIint+1;
            
        }
        
    }
    public static void imprimirdowhileN1_20() {
        int numIint=1;
        do {
            
            System.out.println(numIint);
            numIint++;
        } while (numIint<=21);
    
    }
    public static void main(String[] args) {
        System.out.println("imprime while"); imprimirdowhileN1_20();
        System.out.println("imprime do while"); imprimirdowhileN1_20();
    }
}
