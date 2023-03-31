package com.mycompany.aula5;
import java.util.Scanner;

public class ex9 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int[] r = new int[5];
    int[] s = new int[10];

    System.out.println("Digite os valores do vetor R:");
    for (int i = 0; i < r.length; i++) {
      r[i] = input.nextInt();
    }
    
    System.out.println("Digite os valores do vetor S:");
    for (int i = 0; i < s.length; i++) {
      s[i] = input.nextInt();
    }
    
    System.out.print("Vetor X(R + S): ");
    for (int i = 0; i < 5; i++) {
      System.out.print(r[i] + " ");
    }
    for (int i = 0; i < 10; i++) {
      System.out.print(s[i]+ " ");
    }

  }
}