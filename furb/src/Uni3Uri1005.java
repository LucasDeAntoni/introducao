package Uni3exe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1005 {
    public static void main (String[]args) throws Exception{
    Scanner tec = new Scanner (System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00000");
    
    double a = tec.nextDouble() * 0.35;
    double b = tec.nextDouble() * 0.75;
    double media = a+b;
    

    System.out.println("MEDIA = "+df_2.format(media));
    tec.close();
    }
    
}
