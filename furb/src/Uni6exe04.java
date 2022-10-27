package Uni6exe;

import java.util.Scanner;

public class Uni6exe04 {
    private Uni6exe04(){
        Scanner tec = new Scanner(System.in);
        int vetor1[] = new int [10];
        int vetor2[] = new int [10];
        int soma[] = new int [10];
        for(int cont = 0; cont<vetor1.length; cont ++){
            vetor1[cont] = tec.nextInt();
            vetor2[cont] = tec.nextInt();
        }

        tec.close();
        soma(vetor1, vetor2, soma);


    }
    private void soma(int []vetor1, int[] vetor2, int [] soma){
        for(int cont = 0; cont<vetor1.length; cont ++){
          soma[cont] = vetor1[cont] + vetor2[cont];
        }
        escrever(vetor1, vetor2, soma);
    }
    private void escrever(int []vetor1, int[] vetor2, int [] soma){
        for(int cont = 0; cont<vetor1.length; cont ++){
            System.out.println("vetor 1: "+vetor1[cont]+"  vetor 2: "+vetor2[cont]+"  soma dos vetores: "+soma[cont]);
        }
    }
    public static void main(String[] args) {
        new Uni6exe04();
    }

    
}
