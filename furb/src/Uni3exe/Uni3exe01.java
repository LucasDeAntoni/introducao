package Uni3exe;

import java.util.Scanner;

public class Uni3exe01 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        double largura;
        double comprimento;
        // entradas:
        System.out.println("largura:");
        largura = tec.nextDouble();
        System.out.println("comprimento:");
        comprimento = tec.nextDouble();
        //processos:
        double area;
        area = comprimento*largura;
        //saida:
        System.out.println("area: "+ area);
        tec.close();



    };

    
}
