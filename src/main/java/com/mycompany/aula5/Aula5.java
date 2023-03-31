package com.mycompany.aula5;
import java.util.Scanner;

/*Ler um vetor de números, de 10 elementos. Declarar outro vetor inverso,
copiar todos os elementos de números de trás para frente para o vetor inverso
*/

public class Aula5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] inverso = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = input.nextInt();
        }
        int j = 0;
        for (int i = numeros.length - 1; i >= 0; i--) {
            inverso[j] = numeros[i];
            j++;
        }
        
        System.out.print("Vetor normal: ");
        for (int i = 0; i < inverso.length; i++)
        {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.printf("\nVetor inverso: ");
        for (int i = 0; i < inverso.length; i++) {
            System.out.print(inverso[i] + " ");
        }
        input.close();
    }
}