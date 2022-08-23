package Aula;

import java.util.Scanner;

public class Uni3exe15 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner (System.in);

        int numero = tec.nextInt();

        int centena = numero/100%100;
        int dezena = numero/10%10;
        int unidade = numero%10;

        System.out.println(centena +" centena(s)");
        System.out.println(dezena + " dezena(s)");
        System.out.println(unidade + " unidade(s)");

        tec.close();
        
    }
    
}
