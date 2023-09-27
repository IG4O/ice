import java.util.Scanner;

class Aluno {
    String nome;
    int matricula;
    float n1,n2,n3;
    // n = nota
}

class Main{
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        alunos();
        mostraDados();

    }    
    
    public static void alunos(){
        Aluno[] alunos =  new Aluno[5];
        
        int i;
        for (i = 0; i < alunos.length;i++){
            alunos[i] = new Aluno();

            System.out.println("Digite o nome do aluno");
            alunos[i].nome = entrada.nextLine();
            System.out.println("Digite o matricula do aluno");
            alunos[i].matricula = entrada.nextInt();
            System.out.println("Digite a primeira nota do aluno");
            alunos[i].n1 = entrada.nextFloat();
            System.out.println("Digite a segunda nota do aluno");
            alunos[i].n2 = entrada.nextFloat();
            System.out.println("Digite a terceira nota do aluno");
            alunos[i].n3 = entrada.nextFloat();
            
            calculaNota(alunos[i].n1, alunos[i].n2, alunos[i].n3); 
        }

        if (alunos[i] > ){

        }       
    }

    public static void mostraDados(){
        Aluno aluno = new Aluno();
        System.out.println("Nome                     :" + aluno.nome);
        System.out.println("Matricula                :" + aluno.matricula);
        System.out.println("Digite a nota 1 do aluno :" + aluno.n1);
        System.out.println("Digite a nota 2 do aluno :" + aluno.n2);
        System.out.println("Digite a nota 2 do aluno :" + aluno.n3);
    }

    public static float calculaNota(float n1, float n2, float n3){
        float nota;        
        nota = (n1+n2+n3)/3;
        return nota;
    }

}
