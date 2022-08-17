import java.util.Scanner;

public class Exe11 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        double a = tec.nextDouble();
        double b = tec.nextDouble();
        double c = tec.nextDouble();
        double area_triangulo;
        area_triangulo = (a*c)/2;
        System.out.println("area do triangulo " + area_triangulo);

        double pi = 3.14159;
        double area_circulo;
        area_circulo = pi*c*c;
        System.out.println("area do circulo: "+ area_circulo);

        double area_trapezio;
        area_trapezio= ((a+b)*c)/2;
        System.out.println("area do trapezio: "+ area_trapezio);

        double area_quadrado;
        area_quadrado= b*b;
        System.out.println("area quadrado: "+ area_quadrado);

        double area_retangulo;
        area_retangulo= a*b;
        System.out.println("area do retangulo: "+ area_retangulo);



        tec.close();
    }
    
}
