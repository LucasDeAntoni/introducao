package Uni3exe;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Uni3Uri1008 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        int numero = tec.nextInt();
        int horas = tec.nextInt();
        double valor = tec.nextDouble();

        double salario;
        salario = horas* valor;
        System.out.println("NUMBER = "+numero);
        System.out.println("SALARY = U$ "+df_2.format(salario) );
        tec.close();


    }
    
}
