package Prova;

public class Uni5exe21 {
    public static void main(String[] args) {
        double chico =1.5;
        double ze = 1.10;
        int t = 0;

        while(ze<chico){
            chico= chico + 0.02;
            ze = ze + 0.03;
            t ++;
        }
System.out.println(t);
    }
}
