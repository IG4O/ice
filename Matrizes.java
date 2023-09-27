public class Matrizes {
    public static void main(String[] args){
        int [][] m;

        int n_linhas = 4, n_colunas = 6;
        int valor = 5;

        m = matrizNovaInt(n_linhas, n_colunas);

        m = matrizPreencherInt(m,valor);

        matrizPrintInt(m);

    }

    public static int[][] matrizNovaInt (int n_linhas, int n_colunas){
        int [][] matriz = new int[n_linhas][n_colunas];
        return matriz;
    }

    public static Float[][] matrizNovaFloat(int n_linhas, int n_colunas){
        Float [][] matriz = new Float[n_linhas][n_colunas];
        return matriz;
    }

    public static String[][] matrizNovaString(int n_linhas, int n_colunas){
        String [][] matriz = new String[n_linhas][n_colunas];
        return matriz;
    }

    public static void matrizPrintInt(int[][] matriz){
        int i,j;
        for(i = 0; i < matriz.length; i++){
            for(j=0; j< matriz[0].length;j++){
                System.out.printf("%d ",matriz[i][j]);
            }
            System.out.println();
        }        
    }

    public static void matrizPrintString(String[][] matriz){
        int i,j;
        for(i = 0; i < matriz.length; i++){
            for(j=0; j< matriz[0].length;j++){
                System.out.printf("%s ",matriz[i][j]);
            }
            System.out.println();
        }        
    }

    public static int[][] matrizPreencherInt(int[][] matriz, int valor){
        int i,j;
        for(i = 0; i < matriz.length; i++){
            for(j=0; j< matriz[0].length;j++){
                matriz[i][j]= valor;
            }
            
        } 
        return matriz;
    }

    public static String[][] matrizPreencherString(String[][] matriz, String valor){
        int i,j;
        for(i = 0; i < matriz.length; i++){
            for(j=0; j< matriz[0].length;j++){
                matriz[i][j]= valor;
            }
            
        } 
        return matriz;
    }

    public static void vetorPrintInt(int [] vetor){
        int i;
        for (i = 0; i<vetor.length;i++){
            System.out.printf("%d", vetor[i]);
        }
        System.out.println();
    }

    public static int[] matrizGetLinhaInt(int [][] matriz, int l){
        int [] linha;
        int j;

        linha = new int[matriz[0].length];

        for (j=0;j<linha.length;j++){
            linha[j] = matriz[l][j];
        }

        return linha;
    }

    public static int[] matrizGetColunaInt(int [][] matriz, int c){
        int [] coluna;
        int j;

        coluna = new int[matriz[0].length];

        for (j=0;j<coluna.length;j++){
            coluna[j] = matriz[c][j];
        }
        
        return coluna;
    }

    public static boolean vetorValoresIguaisInt(int[] vetor){
        int i,v;
        v = vetor[0];

        for(i=1; i<vetor.length;i++){
            if(vetor[0]!= v){
                return false;
            }
        }

        return true;
    }

}
