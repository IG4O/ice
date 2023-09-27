public class teste{
    
    //Matrizes

    public static void main(String[] args){
        int [][] m  /*{{10,20,30,40},
                    {50,60,70,80},
                    {90,100,110,120},
                    {130,140,150,160}}*/;
        int i,j;

        int n_linhas = 7, n_colunas = 7;

        m = new int[n_linhas][n_colunas];

        for (i = 0; i<n_linhas; i++){
            for (j=0; j<n_colunas;j++){
                if (i == 0){
                    m[i][j] = 1;
                }
                else {
                    if (i==n_linhas-1){
                        m[i][j] = 1;
                    }else {
                        if(j == 0){
                            m[i][j] = 1;
                        }
                        else{
                            if(j == n_colunas-1){
                                m[i][j] = 1;
                            }
                        }
                    }
                }
                if (m[i][j] == 0){
                    m[i][j] = 9;
                }
            }
            
        }

        for(i=0;i<n_linhas;i++){
            for(j = 0; j<n_colunas;j++){
                if(i==0 || j == 0 || i == n_linhas-1 || j == n_colunas-1){
                    m[i][j] = 0;
                }else{
                    m[i][j] = 9;
                }
            }
        }

        for (i = 0; i<n_linhas; i++){
            for (j=0; j<n_colunas;j++){
                System.out.printf("%d ",m[i][j]);
            }
            System.out.println();
        }
    }
}