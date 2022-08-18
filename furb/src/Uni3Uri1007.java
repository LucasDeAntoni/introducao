package Uni3exe;

import java.util.Scanner;

public class Uni3Uri1007 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);

        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();
        int d = tec.nextInt();
        int diferenca;
        diferenca = a*b - c*d;

        System.out.println("DIFERENCA = "+diferenca);
        tec.close();


    }
    
}
