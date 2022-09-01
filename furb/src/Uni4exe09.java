import java.util.Scanner;

public class Uni4exe09 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int n1 = tec.nextInt();
        int n2 = tec.nextInt();

        if(n1/n2==n2 || n2/n1==n1){
            System.out.println("são multiplos");
        } else{
            System.out.println("não são multiplos");
        }
        tec.close();
    }
    
}
