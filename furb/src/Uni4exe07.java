import java.util.Scanner;

public class Uni4exe07 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double peso = tec.nextDouble();

        if (peso<= 50){
            System.out.println("custo do selo: R$0,45 ");
            

            
        } else  {
            double pesoex = peso - 50;
            double qtad = (pesoex/20 )+1 ;
            double valor = 0.45 + 0.45 * qtad;
            System.out.println("custo do selo: R$ "+ valor);
        }
        tec.close();
    }

    
}
