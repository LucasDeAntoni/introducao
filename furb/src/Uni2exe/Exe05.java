package Uni2exe;
import java.util.Scanner;

public class Exe05 {
        public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();
        int d = tec.nextInt();
        int diferenca;
        diferenca =(a*b)-(c*d);
         System.out.println(diferenca);
         tec.close();

    }
}
