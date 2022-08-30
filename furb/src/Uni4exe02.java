import java.util.Scanner;

public class Uni4exe02 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner (System.in);

        int numero = tec.nextInt();
        
        if (numero % 2 ==0 ) {
            System.out.println("o numero é par.");
        } else {
            System.out.println("o numero é impar");
        }
        tec.close();
        
    }
    
}
