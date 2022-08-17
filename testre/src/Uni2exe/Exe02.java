package Uni2exe;
import java.util.Scanner;

public class Exe02{
    
    public static void main (String[]args) throws Exception{
       Scanner tec =new Scanner(System.in);
       int numero1 = tec.nextInt();
       int numero2 = tec.nextInt();
       int soma;
        soma = numero1 * numero2;
        System.out.println(soma);

        tec.close();
        
    }
}