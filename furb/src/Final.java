package Prova2.Final;

import java.util.Scanner;

public class Final {
    
    
    private Final(){
        Scanner teclado = new Scanner(System.in);
        int jogadal=0;
        int jogadac=0;
         boolean denovo = true;
        char mapa[][]=  new char[3][3];
        do{
            jogarpartida(mapa, teclado, denovo, jogadac, jogadal);
        } while (denovo(teclado, denovo)==true);
    }

    private void jogarpartida(char[][] mapa, Scanner teclado, boolean denovo, int jogadac, int jogadal){
        boolean jogar = true;

        limpaMapa(mapa);
       
        int jogadas=1;
            jogadas++;
        
        escreve(mapa, 0);
        
        while (venceu(mapa, jogadac, jogadas)==false&& denovo==true){


            jogadal= teclado.nextInt();
            jogadac=teclado.nextInt();
            mapa[jogadal][jogadac]= 'X';
            
            escreve(mapa, 0);

            if (venceu(mapa, jogadac, jogadal)== true){
                denovo(teclado, denovo);
            }
        }
    
            
        
        
        }
            
        
        
    

    private boolean denovo (Scanner teclado, boolean denovo){
        System.out.println("deseja jogar de novo? S/N");
        
        String pergunta = teclado.next();
        if (pergunta=="sim"){
            denovo= true;
            return true;
        } else {
            System.out.println("fim");
            denovo= false;
            return false;
        }
        
    }

    private void escreve (char[][] mapa, int jogadas){

        System.out.println("------------- .. jogada:  "+ jogadas);
        System.out.println("| "+mapa[0][0]+ " | "+mapa[0][1] +" | "+mapa[0][2]+ " |");
        System.out.println("-------------");
        System.out.println("| "+mapa[1][0]+ " | "+mapa[1][1] +" | "+ mapa[1][2]+" |");
        System.out.println("-------------");
        System.out.println("| "+mapa[2][0]+ " | " +mapa[2][1]+" | "+mapa[2][2]+ " |");
        System.out.println("-------------");
    }
    private int sortear(int inicio, int fim){
      return (int) ((Math.random()*fim)-inicio); 
    }  
    
    private boolean venceu(char[][] mapa,int jogadac, int jogadal){

        if(mapa[0][0] =='X' && mapa[0][1]=='X' && mapa[0][2]=='X'){
            System.out.println("ganhou :D");
            return true;
        }
        if(mapa[1][0] =='X' && mapa[1][1]=='X' && mapa[1][2]=='X'){
            System.out.println("ganhou :D");
            return true;
        }
        if(mapa[2][0] =='X' && mapa[2][1]=='X' && mapa[2][2]=='X'){
            System.out.println("ganhou :D");
            return true;
        }




        return false;
    }
    

    private void limpaMapa (char [][] matriz){
        matriz [0][0] = ' ';
        matriz [0][1] = ' ';
        matriz [0][2] = ' ';
        matriz [1][0] = ' ';
        matriz [1][1] = ' ';
        matriz [1][2] = ' ';
        matriz [2][0] = ' ';
        matriz [2][1] = ' ';
        matriz [2][2] = ' ';
        

    }

   



    public static void main(String[] args) {
        new Final();
    }
}
