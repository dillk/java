package com.mycompany.aula5;
import java.util.Scanner;


public class ex11 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] vetor = new int[10];
    int posicao = -1;

    System.out.println("Digite os valores do vetor:");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = input.nextInt();
    }

    System.out.print("Vetor: ");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }

    System.out.println("\nDigite o valor a ser excluído:");
    int valor = input.nextInt();

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == valor) {
        posicao = i;
        break;
      }
    }

    if (posicao == -1) {
      System.out.println("Valor não encontrado no vetor.");
    } else {
      for (int i = posicao; i < vetor.length-1; i++) {
        vetor[i] = vetor[i+1];
      }
      vetor[vetor.length-1] = 0;
      
      int[] novoVetor = new int[10];
      int pos = 10;
      for (int i = 0; i < pos; i++) {
        novoVetor[i] = vetor[i];
      }
      System.out.print("Novo vetor: ");
      for (int i = 0; i < 10; i++) {
        System.out.print(novoVetor[i] + " ");
      }

    }
  }
}