package Prova;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int n = 1;
        double hmaior=0;
        double hmenor=0;
        int nmenor=0;
        int nmaior=0;
        int cont =1;

        while(n>0){
            System.out.println("numero:");
            n=tec.nextInt();
            if (n>0){
            System.out.println("altura:");
            double h= tec.nextDouble();
            if (cont==1){
             hmaior=h;
             hmenor=h;
             nmenor=n;
             nmaior=n;
            } else{
            if (h<hmenor){

                hmenor=h;
                nmenor=n;
            } if (h>hmaior){
                hmaior=h;
                nmaior=n;
            }  
            }
            }       
            cont++; 
        }
        System.out.println("menor altura: "+hmenor+ " inscrição: "+nmenor);
        System.out.println("maior altura: "+hmaior+ " inscrição: "+nmaior);
        tec.close();
    }
    
}
