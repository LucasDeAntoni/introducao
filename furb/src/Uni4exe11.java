import java.util.Scanner;

public class Uni4exe11 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        int i1 = tec.nextInt();
        int i2 = tec.nextInt();
        int i3 = tec.nextInt();
        if ( i1 == i2 && i1 == i3){
            System.out.println("trigêmeos");
        } else if (i1 == i2 || i1 == i3|| i3 ==i2 ){
            System.out.println("gemêos");
        } else {
            System.out.println("irmãos");
        }
        tec.close();
    }
    
}
