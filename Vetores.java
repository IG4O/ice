public class Vetores {

    public static int qtdElementos;

    public static void main(String[] args) {        

        /***** [Vetor Novo Int] ******/

        System.out.print("[Vetor Novo Int]/////////////////////////////////// ");

        qtdElementos = 5;
        
        int[] vetorInt = vetorNovoInt(qtdElementos);

        for (int i = 0; i < vetorInt.length; i++){            
            System.out.printf("VetorInt[%d] = %d \n", i, vetorInt[i]);    
        }
        System.out.println();

        System.out.print("[Vetor Novo Float]/////////////////////////////////// ");

        /***** [Vetor Novo Float] ******/ 

        qtdElementos = 5;
        
        Float[] vetorFloat = vetorNovoFloat(qtdElementos);

        for (int i = 0; i < vetorFloat.length; i++){            
            System.out.printf("VetorFloat[%d] = %.1f \n", i, vetorFloat[i]);            
        }
        System.out.println();

        System.out.print("[Vetor Novo Bool]/////////////////////////////////// ");    

        /***** [Vetor Novo Bool] ******/ 

        qtdElementos = 5;
        
        boolean[] vetorBool = vetorNovoBool(qtdElementos);

        for (int i = 0; i < vetorBool.length; i++){            
            System.out.printf("VetorBool[%d] = %b \n", i, vetorBool[i]);            
        }
        System.out.println();

        System.out.print("[Vetor Novo String]/////////////////////////////////// ");

        /***** [Vetor Novo String] ******/ 

        qtdElementos = 5;
        
        String[] vetorString = vetorNovoString(qtdElementos);

        for (int i = 0; i < vetorBool.length; i++){            
            System.out.printf("VetorString[%d] = %s \n", i, vetorString[i]);            
        }
        System.out.println();
        

    }           

    /**
     * @param quantVetor Quantidade de itens no vetor
     * @return retorna a quantidade de vetores com valores inteiros de 0;
     */
    public static int[] vetorNovoInt(int quantVetor){
        int i;
        int[] vetorInt = new int[quantVetor]; 
        
        for (i = 0; i < vetorInt.length; i++){
            vetorInt[i] = 0;
        }
        System.out.println();

        return vetorInt;
    }


    /**
     * @param quantVetor Quantidade de itens no vetor
     * @return retorna a quantidade de vetores com valores reais de 0,0;
     */
    public static Float[] vetorNovoFloat(int quantVetor){
        int i;
        Float[] vetorFloat = new Float[quantVetor]; 
        
        for (i = 0; i < vetorFloat.length; i++){
            vetorFloat[i] = (float) 0.0;
        }
        System.out.println();

        return vetorFloat;
    }

    /**
     * @param quantVetor Quantidade de itens no vetor
     * @return retorna a quantidade de vetores com valores booleanos de false;
     */
    public static boolean[] vetorNovoBool(int quantVetor){
        int i;
        boolean[] vetorBool = new boolean[quantVetor]; 
        
        for (i = 0; i < vetorBool.length; i++){
            vetorBool[i] = false;
        }
        System.out.println();

        return vetorBool;
    }

     /**
     * @param quantVetor Quantidade de itens no vetor
     * @return retorna a quantidade de vetores com valores String de "";
     */
    public static String[] vetorNovoString(int quantVetor){
        int i;
        String[] vetorInt = new String[quantVetor]; 
        
        for (i = 0; i < vetorInt.length; i++){
            vetorInt[i] = "\"\"";
        }
        System.out.println();

        return vetorInt;
    }


    public static void vetorPrintInt(int [] vetor){
        int i;
        for (i = 0; i < vetor.length;i++){
            System.out.printf("%d", vetor[i]);
        }
        System.out.println();
    }

     
}