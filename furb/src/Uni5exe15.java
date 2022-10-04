package Prova;

import java.util.Scanner;

public class Uni5exe15 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String nome = "";
        double nota1 = 0;
        double nota2= 0;
        double media =0;

        while (nome=="fim"){
            nome = tec.next();
            if(nome!="fim"){
            nota1= tec.nextDouble();
            nota2= tec.nextDouble();
            media = (nota1+nota2)/2;
            System.out.println("nome: "+ nome);
            System.out.println("media: "+media);
            }
        }

        tec.close();
    }
    
}
