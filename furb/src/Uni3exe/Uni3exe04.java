package Uni3exe;

import java.util.Scanner;

public class Uni3exe04 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        
        //entradas:
        System.out.println("nota 1:");
        double nota1 = tec.nextDouble();
        System.out.println("nota 2:");
        double nota2 = tec.nextDouble();
        System.out.println("nota 3:");
        double nota3 = tec.nextDouble();

        //processos:
        double media;
        media = (nota1*0.5)+(nota2*0.3)+(nota3*0.2);

        //saida:
        System.out.println( "A media é de "+ media);

        tec.close();
    
    }
    
}
