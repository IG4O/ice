import java.util.LinkedList;
import java.util.Scanner;

class Lista {
    public static void main(String[] args) {
        LinkedList<Float> valores;// No java o que colocamos em "<>" tem que ser um objeto.
        Scanner e = new Scanner(System.in);
        int i;
        float valor = -1, soma = 0, media;
        
        
        valores = new LinkedList<Float>();

        //valores.add(10);
        //valores.add(20);
        //valores.add(30);
        //valores.add(40);
        //valores.add(50);
        //valores.add(60);

        //valores.set(1, 25); // informar a posição,
        //valores.set(1, valores.get(1)+25);//Para adicionar no set
        
        //entrada
        System.out.println("Digite 0 para finalizar");
        while (valor != 0.0f){
            valor = e.nextFloat();
            if(valor != 0){
                valores.add(valor);
            }
        }

        //processamento

        for (i = 0; i < valores.size(); i++){
            soma += valores.get(i);
        }

        //valores.forEach(valor -> soma += valor);

        //soma dos valores
        media = soma/valores.size();
        System.out.println("Média: " + media);
              

        e.close();
        //System.out.println(valores.get(1));
        //System.out.println(valores.size()); //size() retorna quantos elementos tem na lista.
    }
}


