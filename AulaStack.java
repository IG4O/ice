import java.util.Stack;

public class AulaStack {
    
    public static void main(String[] args) {
        int i;
        char c;
        Boolean erro = false;
        String expressao = "()";
    
        Stack<Character> pilha = new Stack<Character>();

        for(i = 0; i<expressao.length(); i++){
            c= expressao.charAt(i);

            switch (c){
                case '(':
                    pilha.push(c);
                    break;
                case ')':
                    if (pilha.isEmpty()){
                        erro = true;                        
                    }else {
                        if(pilha.pop() != '('){
                            erro = true;
                        }
                    }
                    break;
                case '{':
                    pilha.push(c);
                    break;
                case '}':
                    if (pilha.isEmpty()){
                        erro = true;
                    }
                    else{
                        if(pilha.pop() != '{'){
                            erro = true;
                        }
                    }
                    break;
                case '[':
                    pilha.push(c);
                    break;
                case ']':
                    if(pilha.isEmpty()){
                        erro = true;
                    }else{
                        if(pilha.pop() != '['){
                            erro = true;
                        }
                    }
                    break;


            }
            if (erro){
                break;   
            }   
            
        } 

        if(erro || pilha.isEmpty()){
            System.out.println("Expressão inválida");
        }else{
            System.out.println("Expressão valida");
        }

        
    }
    
}
