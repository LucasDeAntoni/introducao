package Uni3exe;

import java.util.Scanner;

public class Uni3exe07 {
    public static void main (String[] args) throws Exception{
        Scanner tec = new Scanner (System.in);
        //entrada:
        System.out.println("quantidade de latas:");
        double nlata = tec.nextInt();
        System.out.println("quantidade de garrafas de 600ml: ");
        double ngarrafinha = tec.nextDouble();
        System.out.println("quantidade de garrafas de 2L:");
        double ngarrafa = tec.nextDouble();

        double lata = 0.350;
        double garrafinha = 0.600;
        double garrafa = 2;

        double quantidade;
        //processos:
        quantidade = (nlata * lata)+ (ngarrafinha*garrafinha) + (ngarrafa + garrafa);
        //saida:
        System.out.println("quantidade em litros: "+ quantidade);

        tec.close();
    }
    
}
