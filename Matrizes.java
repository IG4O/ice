import java.util.Scanner;

public class Matrizes {
    public static Scanner entrada = new Scanner(System.in);
    public static int linhas = 5;
    public static int colunas = 5;
    
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

        System.out.println("[matrizNovaInt]");
        int[][] matrizInt = matrizNovaInt(colunas, linhas);
        imprimirMatrizInt(matrizInt);

        System.out.println();///////////////////////

        System.out.println("[matrizNovaFloat]");
        Float[][] matrizFloat = matrizNovaFloat(colunas, linhas);
        imprimirMatrizFloat(matrizFloat);

        System.out.println();///////////////////////

        System.out.println("[matrizNovaBool]");
        Boolean[][] matrizBool = matrizNovaBool(colunas, linhas);
        imprimirMatrizBool(matrizBool);

        System.out.println();///////////////////////

        System.out.println("[matrizNovaString]");
        String[][] matrizString = matrizNovaString(colunas, linhas);
        imprimirMatrizString(matrizString);


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


    public static int[][] matrizNovaInt(int colunas, int linhas){
        // i = colunas , j = linhas
        int i, j;

        int[][] matrizInt = new int[colunas][linhas];

        for (i = 0; i < colunas;i++){
            for(j = 0; j < linhas; j++){
                matrizInt[i][j] = 0;
            }
        }

        return matrizInt;
    }


    public static Float[][] matrizNovaFloat(int colunas, int linhas){
        int i, j;

        Float [][] matrizFloat = new Float[colunas][linhas];

        for (i = 0; i < colunas;i++){
            for(j = 0; j < linhas; j++){
                matrizFloat[i][j] = (float) 0;
            }
        }
        return matrizFloat;
    }


    public static Boolean[][] matrizNovaBool(int colunas, int linhas){
        int i, j;

        Boolean [][] matrizBool = new Boolean[colunas][linhas];

        for (i = 0; i < colunas;i++){
            for(j = 0; j < linhas; j++){
                matrizBool[i][j] = false;
            }
        }
        return matrizBool;
    }

    public static String[][] matrizNovaString(int colunas, int linhas){
        int i, j;

        String [][] matrizString = new String[colunas][linhas];

        for (i = 0; i < colunas;i++){
            for(j = 0; j < linhas; j++){
                matrizString[i][j] = "\" \"";
            }
        }
        return matrizString;
    }


    /**
     * @param matriz 
     * Funcao que imprime uma matriz inteira
     */
    public static void imprimirMatrizInt(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    /**
     * @param matriz 
     * Funcao que imprime uma matriz real
     */
    public static void imprimirMatrizFloat(Float[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }        
    }

    /**
     * @param matriz 
     * Funcao que imprime uma matriz inteira
     */
    public static void imprimirMatrizBool(Boolean[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    /**
     * @param matriz 
     * Funcao que imprime uma matriz inteira
     */
    public static void imprimirMatrizString(String[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }

}
