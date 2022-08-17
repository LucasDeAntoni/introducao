package Uni2exe;
import java.util.Scanner;

public class Exe10 {
    public static void main (String[]args) throws Exception{
        Scanner tec = new Scanner (System.in);
        int tempo = tec.nextInt();
        int horas;
        horas = tempo/3600%3600;
        int minutos;
        minutos = tempo/60%60;
        int segundos;
        segundos = tempo%60;
        
        
        System.out.println(horas);
        System.out.println(minutos + "\n" + segundos);
        tec.close();

    }
    
}
