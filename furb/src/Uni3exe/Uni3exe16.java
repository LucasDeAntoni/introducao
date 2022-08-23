package Aula;

import java.util.Scanner;

public class Uni3exe16 {
    public static void main(String[] args)throws Exception {
        Scanner tec = new Scanner (System.in);
        int preco = tec.nextInt();
        int pag = tec.nextInt();

        int troco = pag- preco;

        int n100 = troco/100%100;
        int n10 = troco/10%10;
        int n1 = troco %10;

        System.out.println(n100 + " notas de 100 reais,");
        System.out.println(n10+ " notas de 10 reais,");
        System.out.println(n1+ " notas ed 1 real.");
        tec.close();
    }
    
}
