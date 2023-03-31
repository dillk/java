
package com.mycompany.aula5;
import java.util.Scanner;

/*Ler um vetor A de 10 elementos inteiros e um valor X também inteiro.
Armazenar em um vetor M o resultado de cada elemento de A multiplicado
pelo valor de X. Logo após, imprimir o vetor M
*/

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int[] x = new int[1];
        int[] m = new int[10];
        
        for (int i = 0; i < a.length; i++)
        {
            System.out.print("Digite o " + (i+1) + "º valor: ");
            a[i] = input.nextInt();
        }
        System.out.print("Digite o valor a ser multiplicado: ");
        x[0] = input.nextInt();
        
        for (int i = 0; i < a.length; i++)
        {
            m[i] = a[i]*x[0];
        }
        
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(m[i] + " ");
        }
    }
    
}
