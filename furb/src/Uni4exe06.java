import java.util.Scanner;

public class Uni4exe06 {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner (System.in);
        
        char s = tec.next().charAt(0);
        if ( s == 'M' ) {
            System.out.println("masculino");
        } else if (s == 'F'){
                    System.out.println("feminino");
        }
        else if (s == 'I'){
                    System.out.println("não informado");
        } else {
            System.out.println("entrada incorreta");
        }
        
        tec.close();
         } 
        
    }
    

    