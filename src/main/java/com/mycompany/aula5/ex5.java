package com.mycompany.aula5;
import java.util.Scanner;

/*Ler um vetor que contenha as notas de uma turma de 10 alunos.
Calcular a média da turma e contar quantos alunos obtiveram
nota acima desta média calculada. Escrever a média da turma e o
resultado da contagem.
 */
public class ex5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nota = new int[10];

        
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Digite a "+(i+1)+"° nota: ");
            nota[i] = input.nextInt();
        }

        int soma = nota[0] + nota[1] + nota[2] + nota[3] + nota[4] + nota[5] + nota[6] + nota[7] + nota[8] + nota[9];
        int media = soma / 10;
        int alunomedia = 0;
        
        for (int i = 0; i < 10; i++)
        {
            if(nota[i] > media)
            {
                alunomedia++;
            }
        }
        System.out.print("A média da turma é: "+media);
        System.out.print("A quantidade de alunos acima da média foi: "+ alunomedia);
     }
    
}
