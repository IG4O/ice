import java.io.PrintWriter;

public class Arquivos {
    public static void main(String[] args){        
        String mensagem = "busquem conhecimento";
        int resposta = 42;

        String nome = "tads";
        String nome_arquivo;

        // try{
        //     PrintWriter saida = new PrintWriter("saida.txt");
        //     saida.printf("A resposta para a vida, universo e tudo mais é %d\n",resposta);
        //     saida.close();


        // }catch (Exception e){
        //     System.out.println("Erro no arquivo.");
        // }
        

        // try{
        //     PrintWriter saida_pares = new PrintWriter("pares.txt");
        //     PrintWriter saida_impares = new PrintWriter("impares.txt");

        //     for (int i = 1; i <= 10; i++){
        //         if (i%2 == 0){
        //             saida_pares.println(i);
        //         }else{
        //             saida_impares.println(i);
        //         }              
        //     }

        //     saida_pares.close();
        //     saida_impares.close();                    
        // } catch(Exception e){
        //     System.out.println("Erro no arquivo.");
        // }

        nome_arquivo = String.format("java/arquivo_%s.txt", nome);
        try{
            PrintWriter saida = new PrintWriter(nome_arquivo);

            for (int i = 1; i <= 10; i++){
                saida.println(i);            
            }

            saida.close();
        } catch(Exception e){
            System.out.println("Erro no arquivo.");
        }

        
    }   
}
