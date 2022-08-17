package Uni3exe;

import java.util.Scanner;

public class Uni3exe02 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        //entradas:
        System.out.println("informe o valor do produto:");
        double sapato = tec.nextDouble();
        //processos:
        double desconto = sapato * 0.12;
        double valor_final = sapato - desconto;

        //saidas:
        System.out.println("valor do desconto é de R$ "+ desconto);
        System.out.println("o preço do par de sapatos com desconto é de R$ "+ valor_final);
        tec.close();

    }
    
}
