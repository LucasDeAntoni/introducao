package Prova;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5exe20 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00000");
        System.out.println("massa inicial:");
        double massa0= tec.nextDouble();
        double tempo =0;

        while(massa0>0.0005){
            massa0=massa0/2;
            tempo= tempo+50;
        
        }
        System.out.println("massa final:");
        System.out.println(d.format(massa0));
        System.out.println("tempo;");
        System.out.println(tempo);
tec.close();
    }
    
}
