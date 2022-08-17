package Uni3exe;

import java.util.Scanner;

public class Uni3exe03 {

    public static void main (String[]args) throws Exception{
     Scanner tec = new Scanner (System.in);
     //entradas:
        System.out.println("preço do litro:");
      double precolitro = tec.nextDouble();
      System.out.println("valor pago:");
     double pagamento = tec.nextDouble();
      //processo:
      double litros;
      litros=pagamento/precolitro;
       //saida:
      System.out.println("litros abastecidos: "+ litros);

       tec.close();
     }
    
}
