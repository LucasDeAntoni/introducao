
package Final;

import java.util.Scanner;

public class Final2 {
    
    
    private Final2(){
        Scanner teclado = new Scanner(System.in);
        int jogadal=0;
        int jogadac=0;
        int pcl = 0;
        int pcc=0;
         boolean denovo = true;
         boolean resultadopc = false;
         int jogadas=0;
        char mapa[][]=  new char[3][3];
        do{
            jogarpartida(mapa, teclado, denovo, jogadac, jogadal, jogadal, jogadac, pcl, pcc, resultadopc, jogadas);
        } while (venceu(mapa, jogadac, jogadal)==false);
    }

    private void jogarpartida(char[][] mapa, Scanner teclado, boolean denovo, int jogadac, int jogadal,int fim, int inicio, int pcl, int pcc, boolean resultadopc, int jogadas){
        
        int start = sortear(0, fim=2);
        System.out.println("start "+start);
        
            
            
            
            escreve(mapa, jogadas);
            limpaMapa(mapa, jogadas);
            jogadas = 0;
            switch (start){
            
            case 0:
            do{
                jogada(jogadac, jogadal, mapa, teclado);
                jogadas++;
                escreve(mapa, jogadas);
                
                if (venceu(mapa, jogadac, jogadal)== true){
                   jogadas = 0;
                    denovo(teclado, denovo, mapa, resultadopc, jogadas);
                    }
                    
                
                 jogadapc(mapa, pcc, pcl, resultadopc);
                 jogadas++;
                 escreve(mapa, jogadas);
                 if (venceu(mapa, jogadac, jogadal)==true){
                   jogadas = 0;
                    denovo(teclado, denovo, mapa, resultadopc, jogadas);
                 }
                 } while (denovo==true);
                 break;
            case 1:
                do{
                jogadapc(mapa, pcc, pcl, resultadopc);
                jogadas++;
                 escreve(mapa, jogadas);
                 if (venceu(mapa, jogadac, jogadal)==true){
                 jogadas = 0;
                    denovo(teclado, denovo, mapa, resultadopc, jogadas);
                 }

                 jogada(jogadac, jogadal, mapa, teclado);
                 jogadas++;
                 escreve(mapa, jogadas);
                 
                 if (venceu(mapa, jogadac, jogadal)== true){
                    jogadas = 0;
                     denovo(teclado, denovo, mapa, resultadopc, jogadas);
                     }
                     }
                    while (denovo==true);
                } 
            }
        
            
        private boolean jogar (char[][] mapa, int jogadac, int jogadal){
            if(mapa[jogadal][jogadac]==' '){
                return true;
            } else {
                if (mapa[jogadal][jogadac]=='X'){
                    System.out.println("jogada invalida, espaço ocupado pelo jogador X");
                    return false;
                } else {
                    if (mapa[jogadal][jogadac]=='O'){
                        System.out.println("jogada invalida, espaço ocupado pelo jogador O");
                        return false;
                    }
                }
            }
           
            return true;
        }  
    
    private void jogadapc (char[][]mapa, int pcc, int pcl, boolean resultadopc){
        
        
        
         pcl = sortear(0, 3);
        pcc = sortear(0, 3);
        posvalidapc(mapa, pcl, pcc, resultadopc);
        resultadopc = posvalidapc(mapa, pcl, pcc, resultadopc);
        if (resultadopc==true){    
             do{
                pcl = sortear(0, 3);
                pcc = sortear(0, 3);
                posvalidapc(mapa, pcl, pcc, resultadopc);
                resultadopc = posvalidapc(mapa, pcl, pcc, resultadopc);
            }    while (resultadopc==true) ;
                 
        }
        System.out.println("pcl "+pcl);
        System.out.println("pcc "+pcc);      
        mapa[pcl][pcc]= 'O';    
    }


    private boolean posvalidapc (char[][]mapa, int pcl, int pcc, boolean resultadopc){
        
        if (mapa[pcl][pcc]=='X' || mapa[pcl][pcc]=='O'){
            resultadopc = true;
            return true;
        } else {
            resultadopc = false;
            return  false;
        }      
    }
       
          
    
        
    private void jogada(int jogadac, int jogadal, char[][]mapa, Scanner tec){
        jogadal= tec.nextInt();
         jogadac = tec.nextInt();
    
        boolean resultado = jogar(mapa, jogadac, jogadal);
        if(!resultado){
         jogadal= tec.nextInt();
         jogadac = tec.nextInt();
        }
        mapa[jogadal][jogadac]= 'X';
        }
            
        
        
    

    private boolean denovo (Scanner teclado, boolean denovo, char[][] mapa,boolean resultadopc, int jogadas){
        System.out.println("deseja jogar de novo? S/N");
        
        char pergunta = teclado.next().charAt(0);

        switch(pergunta){
            case 'S':
            resultadopc = false;
            
            denovo = true;
            limpaMapa(mapa, jogadas);

            return true;
            
            case 'N':
            System.out.println("jogo encerrado :(");
           
            denovo = false;
            return false;
        }
        return true;
        
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
    

    

    private void limpaMapa (char [][] mapa, int jogadas){
        mapa [0][0] = ' ';
        mapa [0][1] = ' ';
        mapa [0][2] = ' ';
        mapa [1][0] = ' ';
        mapa [1][1] = ' ';
        mapa [1][2] = ' ';
        mapa [2][0] = ' ';
        mapa [2][1] = ' ';
        mapa [2][2] = ' ';
        jogadas=0;
        

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
        //vertical
        if(mapa[0][0] =='X' && mapa[1][0]=='X' && mapa[2][0]=='X'){
            System.out.println("ganhou :D");
            return true;
        }
        if(mapa[0][1] =='X' && mapa[1][1]=='X' && mapa[2][1]=='X'){
            System.out.println("ganhou :D");
            return true;
        }
        if(mapa[0][2] =='X' && mapa[1][2]=='X' && mapa[2][2]=='X'){
            System.out.println("ganhou :D");
            return true;
        }
        //diagonal
        if(mapa[0][0] =='X' && mapa[1][1]=='X' && mapa[2][2]=='X'){
            System.out.println("ganhou :D");
            return true;
        }
        if(mapa[0][2] =='X' && mapa[1][1]=='X' && mapa[2][0]=='X'){
            System.out.println("ganhou :D");
            return true;
        }

        //pc

        if(mapa[0][0] =='O' && mapa[0][1]=='O' && mapa[0][2]=='O'){
            System.out.println("pc venceu.");
            return true;
        }
        if(mapa[1][0] =='O' && mapa[1][1]=='O' && mapa[1][2]=='O'){
            System.out.println("pc venceu.");
            return true;
        }
        if(mapa[2][0] =='O' && mapa[2][1]=='O' && mapa[2][2]=='O'){
            System.out.println("pc venceu.");
            return true;
        }
        //vertical
        if(mapa[0][0] =='O' && mapa[1][0]=='O' && mapa[2][0]=='O'){
            System.out.println("pc venceu.");
            return true;
        }
        if(mapa[0][1] =='O' && mapa[1][1]=='O' && mapa[2][1]=='O'){
            System.out.println("pc venceu.");
            return true;
        }
        if(mapa[0][2] =='O' && mapa[1][2]=='O' && mapa[2][2]=='O'){
            System.out.println("pc venceu.");
            return true;
        }
        //diagonal
        if(mapa[0][0] =='O' && mapa[1][1]=='O' && mapa[2][2]=='O'){
            System.out.println("pc venceu.");
            return true;
        }
        if(mapa[0][2] =='O' && mapa[1][1]=='O' && mapa[2][0]=='O'){
            System.out.println("pc venceu.");
            return true;
        }
 
        if(mapa[0][0]!=' ' && mapa[0][1]!=' ' && mapa[0][2]!=' ' && mapa[1][0]!=' ' && mapa[1][1]!=' ' && mapa[1][2]!=' ' &&
        mapa[2][0]!=' ' && mapa[2][1]!=' ' && mapa[2][2]!=' '){
            System.out.println("empate!");
            return true;
        }
     
        return false;
    }


    public static void main(String[] args) {
        new Final2();
    }
}
