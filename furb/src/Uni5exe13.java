package Prova;

import java.util.Scanner;

public class Uni5exe13 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int nab = tec.nextInt();
        
        
        int cont = 1;
        double km =1;
        double dtotal = 0;
        int qtotal=0;
        double kmtotal = 0;

            for (;cont<=nab; cont++){
             System.out.println("distancia:");
             double dparada = tec.nextInt();
             System.out.println("litros:");
             int  q = tec.nextInt();
             km = dparada/q;
             System.out.println("media da parada: "+km);
             qtotal=qtotal+q;
             dtotal = dtotal+dparada;

        }
        kmtotal = dtotal/qtotal;
        System.out.println("media total: "+kmtotal);

            tec.close();
    }
}
