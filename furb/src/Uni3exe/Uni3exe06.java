package Uni3exe;

import java.util.Scanner;

public class Uni3exe06 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        //entrada:
        System.out.println("peso do prato:");
        double peso = tec.nextDouble();
        //processo:
        double total;
        total = (peso - 0.750) * 25.00;
        //saida:
        System.out.println("total a pagar: R$ "+ total);
        
        tec.close();
    }
    
}
