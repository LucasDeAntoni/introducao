import java.util.Scanner;

public class Uni4exe10 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int marquinhos = tec.nextInt();
        int zezinho = tec.nextInt();
        int luluzinha = tec.nextInt();

        if (marquinhos<zezinho &&  marquinhos<luluzinha ){
            System.out.println("marquinhos é o caçula");
        } else if (zezinho<marquinhos &&  zezinho<luluzinha ){
            System.out.println("zezinho é o caçula");
        } else if (luluzinha<marquinhos &&  luluzinha<zezinho){
            System.out.println("luluzinha é a caçula");
        }
        tec.close();
    }
    
}
