package Uni2exe;
import java.util.Scanner;

public class Exe03 {
    public static void main (String[]args) throws Exception {
        Scanner tec =new Scanner(System.in);
        int raio = tec.nextInt();
        double pi = 3.14159;
        double area;
        area = pi * raio * raio ;
        System.out.println(area);
        tec.close();
    }
    
}
