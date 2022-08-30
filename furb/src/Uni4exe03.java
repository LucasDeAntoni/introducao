import java.util.Scanner;

public class Uni4exe03 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner (System.in);
        int n1 = tec.nextInt();
        int n2 = tec.nextInt();

        if (n1 > n2 ){
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
        tec.close();
    }
    
}
