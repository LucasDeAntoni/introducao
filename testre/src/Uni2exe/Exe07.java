package Uni2exe;
import java.util.Scanner;

public class Exe07 {
    public static void main(String[]args) throws Exception{
        
        Scanner teclado = new Scanner (System.in);
        String nome = teclado.next();
        float fixo = teclado.nextFloat();
        float vendas = teclado.nextFloat();
        float comissao;
        comissao = vendas * 0.15f;
        float total;
        total = comissao + fixo;
        System.out.println(total);
        System.out.println(nome);
        teclado.close();
        



    }
}
