import java.util.Scanner;

public class Matriz {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
            
        int [][] matriz;
        int i,j, valor;

        int n_linhas = 4, n_colunas = 4;

        matriz = new int[n_linhas][n_colunas];



        for (i = 0; i < n_linhas;i++){

            System.out.println("Digite linha: ");
            valor = entrada.nextInt();
            i = valor;

            for(j = 0; j < n_colunas;j++){
                System.out.println("Digite coluna: ");
                valor = entrada.nextInt();
                j = valor;
            }
        }

        


    }

    public static int [][] matrizLeitura(int n_linhas, int n_colunas){
        int [][] matriz = new int[n_linhas][n_colunas];
        int i, j;
        System.out.printf("Entre com os valores da matriz", n_linhas*n_colunas);

        for (i=0;i<n_linhas;i++){
            for(j = 0; j<n_colunas;j++){
                matriz [i][j] = entrada.nextInt();
            }
        }
        return matriz;
    }

    public static void matrizPrint(int [][]matriz){
        for (int i = 0; i<matriz.length; i++){
            for (int j=0; j<matriz[0].length;j++){
                System.out.printf("%d",matriz[i][j]);                
            }
            System.out.println();
        }
    }

    public static int[][] matrizNovaInt (int n_linhas, int n_colunas){
        int [][] matriz = new int[n_linhas][n_colunas];
        return matriz;
    }

}
