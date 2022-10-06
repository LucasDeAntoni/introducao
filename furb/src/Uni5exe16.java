package Prova;

import java.util.Scanner;

public class Uni5exe16 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        
        char s;
        double medgrupo= 0;
        double medf =0;
        int cont=1;
        int contf =1;
        double hm=0;
        
        double hf=0;
        double h=1;

        while(h>0){
            
            h= tec.nextDouble();
            s= tec.next().charAt(0);
            
            
         if (s=='f' || s=='F'){
            hf= hf +h;
            
            medf= hf/contf;
            contf++;
         } if (s=='m' || s=='M'){
            hm =hm + h; 
            }
            
           medgrupo = (hm+hf)/cont;
           cont++;
        }  
            
        
            System.out.println("media das mulheres: "+medf);
            System.out.println("media do grupo: " +medgrupo);
            
            
        
        tec.close();
    }
    }
    

