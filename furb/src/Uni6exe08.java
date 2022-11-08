package Uni6exe;

import java.util.Scanner;

public class Uni6exe08 {
    public static void main(String[] args) {
        new Uni6exe08();
    
        Scanner tec = new Scanner(System.in);
        int n=0;
        do{
            System.out.println("informe o tamanho do vetor.");
             n = tec.nextInt();
        }   while (n<1 || n>20);

        double vetor[] = new double[n]; 
        System.out.println("informe os valores do vetor.");
        for (int i = 0; i<vetor.length; i++){
            vetor[i]= tec.nextDouble();
        }

        boolean[] repetidos = new boolean[n];
        for (int i = 0; i < repetidos.length; i++) {
            repetidos[i] = false;
        }
        boolean contado = true;

        System.out.println("Valor | Frequência");
        int contador = 0;
        for (int i = 0; i < repetidos.length; i++) {
            contador = 0;
            if (repetidos[i] != true) {
                for (int j = 0; j < repetidos.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        contador++;
                        repetidos[j] = contado;
                    }
                }
                System.out.println(" " + vetor[i] + "        " + contador);
                
            }
            
        }

    tec.close();
}
    
    }

