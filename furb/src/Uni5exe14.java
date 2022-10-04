package Prova;

import java.util.Scanner;

public class Uni5exe14 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String nome = "";
        double pc =0;
        double pct =0;
        double pv = 0;
        double pvt = 0;
        int cont =1;
        double lperc = 0;
        double l = 0;
        double ltotal =0;
        for (;cont<=20; cont++){
            nome = tec.next();
            pc= tec.nextDouble();
            pv = tec.nextDouble();
            lperc = (pv-pc)/pc*100;
            if (lperc<10){
                System.out.println("menor que 10%, " + lperc+ " "+ nome);
            } if (lperc>=10 && lperc<=20){
                System.out.println("entre 10% e 20%, " +lperc+ " "+ nome);
            } if (lperc>20){
                System.out.println("maior que 20%, "+ lperc+ " "+ nome);
            }
            l = pv-pc;
            ltotal= ltotal +l;
            pct = pct +pc;
            pvt = pvt +pv;
            tec.close();

        }
        System.out.println("preço de compra total: "+ pct);
        System.out.println("preço de venda total: "+pvt);
        System.out.println("lucro total: "+ltotal);

        tec.close();


    }
    
}
