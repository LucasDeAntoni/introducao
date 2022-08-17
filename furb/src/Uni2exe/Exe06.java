package Uni2exe;
import java.util.Scanner;

public class Exe06 {
        public static void main (String[] args) throws Exception{
        Scanner tec = new Scanner (System.in);
        double numero = tec.nextDouble();
        double hora = tec.nextDouble();
        double valor = tec.nextDouble();
        double salario;
        salario= hora*valor;
        System.out.println(numero);
        System.out.println(salario);
        tec.close();
    }
        
}

    
