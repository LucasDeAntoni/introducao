import java.util.Scanner;

public class Uni4exe01 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner (System.in);

        int horas = tec.nextInt();
        double hvalor = tec.nextDouble();

        double stotal = horas*hvalor;
        if (horas > 160) {
            double hextra =  (horas - 160) * hvalor/2;
            stotal = stotal + hextra;
        }
        System.out.println( "o salario total é: " + stotal);
        tec.close();
    }
}
