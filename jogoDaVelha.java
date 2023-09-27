import java.util.Scanner;

public class jogoDaVelha {
    public static Scanner entrada;

    public static void main(String[] args){
        System.out.println("### JOGO DA VELHA ###");
        System.out.printf("Ganhador: %s\n",jogar());
        
    }

    public static String jogar(){
        String [][] jogo = matrizNovaStr(3,3);
        int jogadas = 0;

        while (jogadas <9){
            mostraJogo(jogo);
            if (jogadas%2 == 0){
                //j1
                System.out.println("Jogador 1:");
                jogada(jogo, "X");
                
            }else{
                //j2
                System.out.println("Jogador 2:");
                jogada(jogo, "O");
            }
            if(jogoGanho(jogo,"X")){
                return "Jogador 1";
            }
            if(jogoGanho(jogo,"X")){
                return "Jogador 2";
            }
            jogadas++;
        }
        return "Empate!";

    }

    public static String[][] matrizNovaStr(int n_linhas, int n_colunas){
        int i,j;
        String [][] matriz = new String[n_linhas][n_colunas];

        for(i = 0; i <matriz.length;i++){
            for(j=0; j < matriz[0].length; i++){
                matriz[i][j] = "_";                
            }
        }
        return matriz;
        
    }

    public static void mostraJogo(String[][] jogo){
        int i,j;

        for(i = 0; i <jogo.length;i++){
            for(j=0; j < jogo[0].length; i++){
                System.out.printf("%s", jogo[i][j]);
            }
        }
    }

    public static void jogada(String [][] jogo, String marcador){
        int linha,coluna;
        System.out.println("Entre com a linha e coluna: ");
        
        linha = entrada.nextInt();
        coluna = entrada.nextInt();

        jogo[linha][coluna] = marcador;
    }

    public static Boolean jogoGanho(String[][] jogo, String marcador){
        int i = 0;
        int j = 0; 
        
        //linhas
        for(i = 0; i< 3; i++){
            if(jogo[i][0].equals(marcador) && jogo[i][1].equals(marcador) && jogo[i][2].equals(marcador)){
            return true;
            }

        }
        
        for (j = 0; j < 3; j++){
            if(jogo[0][j].equals(marcador) && jogo[1][j].equals(marcador) && jogo[2][j].equals(marcador)){
            return true;
            }

        }
        

        //diagonais
        if (
            (jogo[0][0].equals(marcador) && jogo[1][1].equals(marcador) && jogo[2][2].equals(marcador)
            ||
            (jogo[0][2].equals(marcador) && jogo[1][1].equals(marcador) && jogo[2][0].equals(marcador))
            )
        ){
            return true;
        }
        

        return false;
    }


}


//colocar um "-" para quando não estiver marcado e acrescentar o "x" e "o" 
//m[0][0] == m[1][1] e etc.
