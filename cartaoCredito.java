import java.util.Scanner;

class Cartao{
    String nome, bandeira,numero;
    int venc_mes, venc_ano,cvv;    
}

class CartaoCredito {

    public static Scanner entrada = new Scanner(System.in);

    public static Cartao registroCartao(){
        Cartao c = new Cartao();
        System.err.println("SISTEMA");
        System.out.println("Dados do cartao :");
        System.out.println("Digite o nome impresso no cartao: ");
        c.nome = entrada.nextLine();

        System.out.println("Digite o número do cartao: ");
        c.numero = entrada.nextLine();

        System.out.println("Digite a bandeira: ");
        c.bandeira = entrada.nextLine();

        System.out.println("Digite o mes e ano de vencimento do cartao: ");
        c.venc_mes = entrada.nextInt();
        c.venc_ano = entrada.nextInt();
        
        System.out.println("Digite o codigo de seguranca: ");
        c.cvv = entrada.nextInt();

        return c;
    }

    

    public static void main(String[] args){
        Cartao cliente_1 = new Cartao();
        cliente_1 = registroCartao();
        printCartao(cliente_1);
    }


    public static Cartao printCartao(Cartao cartao){
        
        System.out.println("Nome      : "+cartao.nome);
        System.out.println("Numero    : "+cartao.numero);
        System.out.println("Bandeira  : "+cartao.bandeira);
        System.out.println("Vencimento: "+cartao.venc_mes+"/"+cartao.venc_ano);
        System.out.println("CVV       : "+cartao.cvv);
        return cartao;
    }
}

