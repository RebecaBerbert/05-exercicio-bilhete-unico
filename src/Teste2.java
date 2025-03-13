public class Teste2 {
    public static void main (String[] args){

        System.out.println("soma="+ somar (2,3));
        System.out.println("soma="+ somar (2,3,4));
        System.out.println("soma="+ somar (2,3,1,7));
    }

    public static int somar(int ...x){   //método para fazer todos em um mesmo metodo
        int total=0;

        for (int i:x){  //for reduzido ( para cada valor do vetor)
            total+=i;
        }
        return total;
    }

}
