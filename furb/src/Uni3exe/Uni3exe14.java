package Aula;

import java.util.Scanner;

public class Uni3exe14 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner (System.in);
        double dis = tec.nextDouble();
        double tempo = tec.nextDouble();
        double v = dis/tempo;
        double c = dis/12;
        System.out.println("velocidade media: "+ v);
        System.out.println("consumo de compustivel: "+c);
        tec.close();
    }
    
}
