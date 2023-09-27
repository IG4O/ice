

class produto{
    String descricao;
    int lote;
    float peso;
}

class main{
    public static void main(String[] args){

        produto prod1, prod2;
        prod1 = new produto();
        prod2 = new produto();

        prod1.descricao = "Arroz";
        prod1.lote = 100;
        prod1.peso = 1f;

        prod2.descricao = "Feijao";
        prod2.lote = 30;
        prod2.peso = 5f;


        System.out.printf("Produto: %d %s %f \n", prod1.lote, prod1.descricao, prod1.peso);
        System.out.printf("Produto: %d %s %f \n", prod2.lote, prod2.descricao, prod2.peso);
    }
}

class Cartao{
    String nome;
    String numeroCartao;
    String dataVencimento;
    int codigoSeguranca;
}