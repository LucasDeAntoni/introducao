import java.util.Scanner;

public class Uni4exe04 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner (System.in);
        double numero = tec.nextDouble();

      if (numero == (int)numero) {
          System.out.println("o numero é inteiro.");
      } else {
          System.out.println("o numero não é inteiro.");
      }
      tec.close();
    }
    
}
