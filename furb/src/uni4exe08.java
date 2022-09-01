import java.util.Scanner;

public class uni4exe08 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        char letra = tec.next().charAt(0);
        if (letra =='a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ){
            System.out.println("vogal");
        } else {
            System.out.println("NÃO é vogal");
        }
        tec.close();
    }
    
}
