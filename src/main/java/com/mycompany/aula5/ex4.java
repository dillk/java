package com.mycompany.aula5;
import java.util.Scanner;
import java.util.Random;
/*Gerar um vetor C de 10 números aleatoriamente, após pedir que
o usuário digite um número, pesquisa por este número no vetor.
Escrever a mensagem ACHEI se o número estiver armazenado no vetor C
ou NÃO ACHEI caso contrário
 */
public class ex4 {
    public static void main(String[] args) {
        int[] C = new int[10];
        Random rand = new Random();
        for (int i = 0; i < C.length; i++) {
            C[i] = rand.nextInt(100) + 1;
        }
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
        {
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        boolean achou = false;
        for (int j = 0; j < C.length; j++) {
            if (C[j] == numero) {
                achou = true;
                break;
            }
        }

        if (achou) {
            System.out.println("ACHEI");
            i = 3;
        } else {
            System.out.println("NÃO ACHEI");
        }
        }
        for (int i = 0; i < C.length; i++)
        {
            System.out.print(C[i] + " ");
        }
        input.close();
    }
}