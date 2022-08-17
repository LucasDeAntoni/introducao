import java.util.Scanner;

public class Circ2{

    public static void main(String[] args) throws Exception {
        
        try (Scanner teclado = new Scanner (System.in)) {
            System.out.println();
            int raio = teclado.nextInt();
            double pi = 3.1415;
            double area;
            area = raio * raio * pi;
            System.out.println(area);
        }


    }
    }    