public class Matrizes {
    public static int linhas = 5;
    public static int colunas = 5;

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

    public static void main(String[] args) {
        
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

        System.out.println();///////////////////////

        System.out.println("[matrizPrintInt]");
        int[][] matrizExemploInt = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        matrizPrintInt(matrizExemploInt);

        System.out.println();///////////////////////

        System.out.println("[matrizPrintString]");
        String[][] matrizExemploString = {
            {"A", "B", "C"},
            {"D", "E", "F"},
            {"G", "H", "I"}
        };

        matrizPrintString(matrizExemploString);

        System.out.println();///////////////////////

        System.out.println("[matrizPrintFloat]"); 
        Float[][] matrizExemploFloat = {
            {(float)1,(float) 2,(float) 3},
            {(float)4,(float) 5,(float) 6},
            {(float)7,(float) 8,(float) 9}
        };

        matrizPrintFloat(matrizExemploFloat);

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

/////////////////////////////////////////

    public static void matrizPrintInt(int[][] matrizInt){
        for (int i = 0; i<matrizInt.length; i++){
            for (int j=0; j<matrizInt[0].length;j++){
                System.out.printf("%d ",matrizInt[i][j]);                
            }
            System.out.println();    
        }
    }

    public static void matrizPrintString(String[][] matrizString){
        for (int i = 0; i<matrizString.length; i++){
            for (int j=0; j<matrizString[0].length;j++){
                System.out.printf("%s ",matrizString[i][j]);                
            }
            System.out.println();    
        }
    }

    public static void matrizPrintFloat(Float[][] matrizString){
        for (int i = 0; i<matrizString.length; i++){
            for (int j=0; j<matrizString[0].length;j++){
                System.out.printf("%.1f ",matrizString[i][j]);                
            }
            System.out.println();    
        }
    }
}
