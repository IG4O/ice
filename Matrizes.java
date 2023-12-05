import java.util.Scanner;

public class Matrizes {
    public static Scanner entrada = new Scanner(System.in);

    public static void imprimirMatrizInt(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int linhas = 5;
        int colunas = 5;
        
        int[][] matrizInt = matrizNovaInt(colunas, linhas);
        imprimirMatrizInt(matrizInt);
        

        System.out.println("-------------------------------");

        int[][] matrizExemploInt = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        matrizPrintInt(matrizExemploInt);

        System.out.println("-------------------------------");

        matrizPrintInt(matrizPreencherInt(matrizExemploInt, colunas));

        System.out.println("-------------------------------");

        
        int[][] matrizEx1 = new int[3][3];

        //matrizPrintInt(matrizLeiaInt(matrizEx1));

        System.out.println("-------------------------------");

        // Float[][] matrizExemploFloat = {
        //     {(float)1, (float)2, (float)3},
        //     {(float)4, (float)5, (float)6},
        //     {(float)7, (float)8, (float)9}
        // };


        matrizPrintFloat((matrizConverteIntParaFloat(matrizExemploInt)));

        System.out.println("-------------------------------");

        matrizPrintInt(matrizSomaInt(matrizExemploInt, matrizExemploInt));

        System.out.println("-------------------------------");

        
        matrizPrintInt(matrizNovaIdentidadeInt(colunas));
        
        System.out.println("-------------------------------");

        int[][] m1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        boolean iguais = matrizesComparacaoInt(matrizEx1, m1);
        System.out.println(iguais);
    }
    //1
    public static int[][] matrizNovaInt(int colunas, int linhas){
        int i, j;

        int[][] matrizInt = new int[colunas][linhas];

        for (i = 0; i < colunas;i++){
            for(j = 0; j < linhas; j++){
                matrizInt[i][j] = 0;
            }
        }

        return matrizInt;
    }

    //2
    public static void matrizPrintInt(int[][] matrizInt){
        for (int i = 0; i<matrizInt.length; i++){
            for (int j=0; j<matrizInt[0].length;j++){
                System.out.printf("%d ",matrizInt[i][j]);                
            }
            System.out.println();    
        }
    }

    public static void matrizPrintFloat(Float[][] matrizFloat){
        for (int i = 0; i<matrizFloat.length; i++){
            for (int j=0; j<matrizFloat[0].length;j++){
                System.out.printf("%.1f ", matrizFloat[i][j]);                
            }
            System.out.println();    
        }
    }

    //3
    public static int[][] matrizPreencherInt(int[][] matriz, int n){        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = n; 
            }
        }
        return matriz;
    }

    //4
    public static int[][] matrizLeiaInt(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {            
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }
        entrada.close();
        return matriz;
    }

    //6
    public static boolean matrizesComparacaoInt(int[][] A, int[][] B){

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != B[i][j]) {
                    
                    return false;
                }
            }
        }

        return true;

    }


    //9
    public static Float[][] matrizConverteIntParaFloat(int[][] matriz){
        Float[][] matrizFloat = new Float[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizFloat[i][j] = (float)matriz[i][j];
            }
        }
        return matrizFloat;
    }



    //Operacoes matematicas
    //1
    public static int[][] matrizSomaInt(int[][] A, int[][] B){
        int[][] C = new int[A.length][B.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    
    //4
    public static int[][] matrizNovaIdentidadeInt(int ordem){
        int[][] matriz_identidade = new int[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if(i == j){
                    matriz_identidade[i][j] = 1;
                } else {
                    matriz_identidade[i][j] = 0;
                }
            }
        }
        return matriz_identidade;
    }


}
