package Uni3exe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1002 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        DecimalFormat df_2 = new DecimalFormat("0.0000");
        double raio = tec.nextDouble();
        double pi =3.14159;
        double area;
        area = pi * raio *raio;
        System.out.println("A="+df_2.format(area));
        tec.close();
    }
    
}
