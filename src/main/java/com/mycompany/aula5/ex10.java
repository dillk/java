package com.mycompany.aula5;
import java.util.Scanner;
public class ex10 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int[] x = new int[10];
    int[] y = new int[10];
    int[] r = new int[20];
    int j = 0;

    System.out.println("Digite os valores do vetor X:");
    for (int i = 0; i < x.length; i++) {
      x[i] = input.nextInt();
    }
    System.out.println("Digite os valores do vetor Y:");
    for (int i = 0; i < y.length; i++) {
      y[i] = input.nextInt();
    }

    for (int i = 0; i < x.length; i++) {
      r[j] = x[i];
      r[j+1] = y[i];
      j += 2;
    }

    System.out.print("Vetor R: ");
    for (int i = 0; i < r.length; i++) {
      System.out.print(r[i] + " ");
    }
  }
}