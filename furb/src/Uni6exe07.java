package Uni6exe;

import java.util.Scanner;

public class Uni6exe07 {
    private Uni6exe07(){
        Scanner tec = new Scanner(System.in);
        System.out.println("informe o tamanho do vetor.");
        int n = tec.nextInt();
        int vetor [] = new int[n];
        System.out.println("insira os valores do vetor:");
        int add = 0;
        boolean achou;
        
        for (int i = 0; i<vetor.length; i ++){
            add = tec.nextInt();
            achou = Pesquisa(i, vetor, add);
            if (achou == true){
                System.out.println("Valor informado não pode ser iguala valor já existente.");
                i--;
            } else {
                vetor[i]=add;
            }
        }
        bolha(vetor);
        tec.close();
        }
    private boolean Pesquisa(int i, int vetor[], int add) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == add) {
                    return true;
                }
            }
            return false;
        }


    private void bolha(int vetor[]) {
            System.out.print("Vetor origem:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("[" + vetor[i] + "]");
            }
            int bolha = 0;
            for (int j = 0; j < vetor.length; j++) {
                for (int i = 0; i < vetor.length - 1; i++) {
                    if (vetor[i] > vetor[i + 1]) {
                        bolha = vetor[i];
                        vetor[i] = vetor[i + 1];
                        vetor[i + 1] = bolha;
                    }
                }
            }
            System.out.print("\nVetor ordenado: ");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("[" + vetor[i] + "]");
            }
    
        }
        public static void main(String[] args) {
            new Uni6exe07();
        }

    }

