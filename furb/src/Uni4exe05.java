import java.util.Scanner;

public class Uni4exe05 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        boolean r = tec.nextBoolean();
        if (r == true){
            System.out.println("sim");
        } else if ( r == false){
            System.out.println("não");
        }
        
        tec.close();
    }
    
}
