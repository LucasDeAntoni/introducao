package Uni3exe;

import java.util.Scanner;

public class Uni3exe05 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        //entrada:
        System.out.println("informe o numero de animais:");
        int ndeanimais= tec.nextInt();
        //processos:
        int chip;
        chip = ndeanimais *4;

        double anelali;
        anelali = ndeanimais * 2 * 3.50;

        double total;
        total = anelali + chip;
        //saida:
        System.out.println("Gasto total com aneis: R$ "+ total);

        tec.close();
    }
    
}
