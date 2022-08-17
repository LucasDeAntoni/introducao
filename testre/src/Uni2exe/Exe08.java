package Uni2exe;
import java.util.Scanner;

public class Exe08 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        int codigo1 = tec.nextInt();
        int numero1 = tec.nextInt();
        int valor1 = tec.nextInt();
        int total1;
        total1 = numero1 * valor1;
       
        int codigo2 = tec.nextInt();
        int numero2 = tec.nextInt();
        int valor2 = tec.nextInt();
        int total2;
        total2 = numero2 * valor2;
        System.out.println(codigo1 + "/n" + codigo2);
    
        int total;
        total = total1 + total2;
        System.out.println(total);
        tec.close();
        

    }
    
}
