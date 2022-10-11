package Prova;

import java.text.DecimalFormat;

public class Uni5exe22 { 
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("0.00");

        double sal =2000;
        double aumento = 30;
        int ano = 1995;

        while( ano<=2000){
            
            sal = sal + aumento;
            ano++;
            aumento = aumento *2;


        }
        System.out.println(d.format(sal));
        System.out.println(sal);
        
    }
    
}
