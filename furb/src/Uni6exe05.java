package Uni6exe;

import java.util.Scanner;

public class Uni6exe05 {
    private Uni6exe05(){
        Scanner tec = new Scanner(System.in);
        String pergunta[] = new String[5];
        String rhomem[] = new String[5];
        String rmulher[] = new String[5];

        System.out.println("as perguntas devem ser respondidas com 'SIM', 'NAO' ou 'IND'. A primeira respota será do homem e a segunda da mulher.");

        System.out.println("Gosta de música sertaneja?");
            rhomem[0] = tec.next();
            rmulher[0] = tec.next();
        System.out.println("Gosta de futebol?");
            rhomem[1] = tec.next();
            rmulher[1] = tec.next();
         System.out.println("Gosta de seriados?");
            rhomem[2] = tec.next();
            rmulher[2] = tec.next();
        System.out.println("Gosta de redes sociais?");
            rhomem[3] = tec.next();
            rmulher[3] = tec.next();
        System.out.println("Gosta da Oktoberfest?");
            rhomem[4] = tec.next();
            rmulher[4] = tec.next();
            
        
            calculo(pergunta, rhomem, rmulher);
    tec.close();
    }    
    
    private void calculo(String[] pergunta, String[] rhomem, String[] rmulher){
        int indice = 0;
        for(int cont = 0; cont<rmulher.length; cont ++){
            if(rhomem[cont] == rmulher[cont]){
                indice = indice + 3;
            } else if (rhomem[cont] == "IND" && rmulher[cont]!= "IND") {
                indice = indice +1;
            } else if(rhomem[cont] == "SIM" && rmulher[cont] == "NAO" || rmulher[cont]=="SIM" && rhomem[cont] == "NAO"){
                indice = indice-2;
            }
        }
        resultados(indice);
    }
    private void resultados (int indice){
        if (indice == 15){
            System.out.println("Casem!");
        } else if (indice>=10 && indice<=14){
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (indice>=5 && indice <=9){
            System.out.println("Talvez não dê certo :(");
        } else if (indice >=0 && indice <=4){
            System.out.println("Vale um encontro");
        } else if (indice>=-1 && indice<=-9){
            System.out.println("Melhor não perder tempo");
        } else if (indice<=-10){
            System.out.println("Vocês se odeiam!");
        }       
    }
    public static void main(String[] args) {
        new Uni6exe05();
    }
}

