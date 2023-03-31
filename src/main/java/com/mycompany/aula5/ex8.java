package com.mycompany.aula5;
import java.util.Scanner;

public class ex8 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] x = new int[10];
    int[] r = new int[x.length];
    int j = 0;

    System.out.println("Digite os valores do vetor X:");
    for (int i = 0; i < x.length; i++) {
      x[i] = input.nextInt();
    }
    for (int i = 0; i < x.length; i++) {
      if (x[i] < 0) {
        r[j] = x[i];
        j++;
      }
    }

    System.out.print("Vetor X: ");
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + " ");
    }

    System.out.print("\nVetor R: ");
    for (int i = 0; i < r.length; i++) {
      if (r[i] != 0) {
        System.out.print(r[i] + " ");
      }
    }
  }
}