public class Vetores {
    public static void main(String[] args) {        
        int qtdElementos = 5;
        
        int[] vetorInt = vetorNovoInt(qtdElementos);

        for (int i = 0; i < vetorInt.length; i++){            
            System.out.printf("VetorInt[%d] = %d \n", i, vetorInt[i]);    
        }
        System.out.println();

        System.out.println("-------------------------------");

        int[] vetorPrintInt = {1, 2, 3, 4, 5, 6, 7, 8};

        vetorPrintInt(vetorPrintInt);

        System.out.println("-------------------------------");

        boolean[] vetorboolean = {true, false, true, false};

        
        vetorPrintInt(vetorBooleanParaInt(vetorboolean));

        System.out.println("-------------------------------");

        int[] vetorTeste1 = {1,1,1,1,1,1,0,1,1,1,1};
        System.out.println(vetorValoresIguaisInt(vetorTeste1));

        System.out.println("-------------------------------");

        int [] vetorTeste2 = {2,2};
        System.out.println(vetorSomaInt(vetorTeste2));
        
        System.out.println("-------------------------------");

        int[] vetorTeste3 = {2,2,4,9,11};
        int[] vetorTeste4 = {2,2,3,6,4};

        vetorPrintInt(vetorSomaVetoresInt(vetorTeste3,vetorTeste4));

        System.out.println("-------------------------------");

        int[] vetorTeste5 = {1,3,5,7,9,4};
        System.out.println(vetorMenorInt(vetorTeste5));
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
        for (int i = 0; i < vetor.length;i++){
            System.out.printf("%d", vetor[i]);
        }
        System.out.println();
    }

    public static int[] vetorBooleanParaInt(boolean[] vetorbool){
        int tamanhoVetor = vetorbool.length;
        int[] vetorInt = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetorbool[i] == true){
                vetorInt[i] = 1;
            }else{
                vetorInt[i] = 0;
            }
        }
        return vetorInt;
    }

    public static boolean vetorValoresIguaisInt(int[] vetorInt){
        int primeiroValor = vetorInt[0];

        for (int i = 1; i < vetorInt.length; i++) {
            if (vetorInt[i] != primeiroValor) {                
                return false;
            }
        }
        return true;

    }

    public static int vetorSomaInt(int[] v){
        int valor, soma = 0;
        for (int i = 0; i < v.length; i++) {
            valor = v[i]++;
            soma += valor;
        }
        return soma;
    }

    public static int[] vetorSomaVetoresInt(int[] v, int[] w){        
        int[] z = new int[v.length];        
        
        for (int i = 0; i < v.length; i++) {
            z[i] = v[i]+ w[i];             
        }

        return z;
    }

    public static int vetorMenorInt(int[] v){
        int menorValor = v[0];

        for (int i = 1; i < v.length; i++) {
            if (v[i] < menorValor) {
                menorValor = v[i];
            }
        }

        return menorValor;
    }
     
}