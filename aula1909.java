import java.util.Stack;

public class aula1909 {
    
    public static void main(String[] args) {
        int x;
    
        Stack<Integer> pilha = new Stack<Integer>();

        pilha.push(10);//empilhar
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.push(60);


        while(!pilha.isEmpty()){
            x = pilha.pop();
            System.out.println(x);
        }

    }
    
    
}
