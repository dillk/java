package com.mycompany.aula5;
import java.util.Scanner;
import java.util.Random;
/*Declarar um vetor númnero com 20 elementos, gerar valores inteiros
para ele aleatoriamente (com o limite do número 100). Declare outros
dois vetores, par e impar. No vetor par armazenar todos os elementos pares
do vetor números. no vetor ímpar armazenar todos os elementos ímpares de
números. Imprima os dois vetores
 */
public class ex3 {
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           int[] numeros = new int[20];
           int[] par = new int[20];
           int[] impar = new int[20];
            
           Random rand = new Random();
           for (int i = 0; i < numeros.length; i++)
           {
               numeros[i] = rand.nextInt(100) + 1;
           }
           
           int j = 0;
           int k = 0;
           
           for (int i = 0; i < numeros.length; i++)
           {
               if (numeros[i] % 2 == 0)
               {
                   par[j] = numeros[i];
                   j++;
               } else
               {
                   impar[k] = numeros[i];
                   k++;
               }
           }
           
           System.out.print("Vetor par: ");
           for(int i = 0; i < j; i++)
           {
               System.out.print(par[i] + " ");
           }
           System.out.println();
           
           System.out.print("Vetor ímpar: ");
           for(int i = 0; i < k; i++)
           {
               System.out.print(impar[i] + " ");
           }
           System.out.println();
       }
}
