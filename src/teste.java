import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main (String[] args){


        int[] numeros= new int[10];
        carregar(numeros);
        imprimir(numeros);
        }

        public static void imprimir(int[] numeros){
        for(int i=0;i< numeros.length;i++){
            System.out.println(numeros[i]);
        }
         for (int i: numeros){
             System.out.println(i);
         }

        }

        public static void carregar(int[] numeros){
         Random random= new Random();
         for (int i=0; i< numeros.length; i++){
             numeros[i]=random.nextInt(15);

            }
        }

        }



