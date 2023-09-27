import java.util.LinkedList;
import java.util.Scanner;
class Lista2 {
    public static void main(String[] args) {
        LinkedList<Integer> valores;// No java o que colocamos em "<>" tem que ser um objeto.
        Scanner e = new Scanner(System.in);
        int i, k = 100, passo = 10;
        
        valores = new LinkedList<Integer>();

        i = 0;
        while (i<k){
            valores.add(i);
            i+=passo;
        }

        valores.remove(3);


        for (i =0; i< valores.size();i++){
            System.out.println(valores.get(i));
        }

    }
}




    



