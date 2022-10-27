package Uni6exe;

import java.util.Scanner;

public class Uni6exe03 {
    private Uni6exe03(){
        Scanner tec = new Scanner(System.in);
        double numero[] = new double[12];
        for(int cont = 0; cont<numero.length; cont ++){
            numero[cont]= tec.nextDouble();
        }
        tec.close();
        ajuste(numero);

    }
    private void ajuste (double[] numero){
        for(int cont = 0; cont<numero.length; cont ++){
            if(cont % 2 != 0){
                numero[cont] = numero[cont]* 1.05;
            } else {
                numero[cont]= numero[cont]* 1.02;
            }

        }
        escrever(numero);
    }
    private void escrever (double [] numero){
        for(int cont = 0; cont<numero.length; cont ++){
        System.out.println("valor após ajuste: "+numero[cont]);
        }
    }
    public static void main(String[] args) {
        new Uni6exe03();
    }
}
