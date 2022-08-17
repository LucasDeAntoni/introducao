package Uni2exe;
import java.util.Scanner;

public class Exe09 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        double dolares = tec.nextDouble();
        double cotaçao = 5.10;
        double real;
         real = dolares * cotaçao;
        System.out.println(real);
        tec.close();

    }
    

    
}
