/*
* O=================================================================================================O
* | Exercício 8                                                                                     |
* | • Escreva um programa que, dadas as informações abaixo, calcule a média final do aluno:         |
* |                                                                                                 |
* |     1º Bimestre                                                                                 |
* |         P1 valendo 60% da nota                                                                  |
* |         T1 valendo 30% da nota                                                                  |
* |         LE valendo 10% da nota                                                                  |
* |                                                                                                 |
* |     2º Bimestre                                                                                 |
* |         P2 valendo 50% da nota                                                                  |
* |         T2 valendo 35% da nota                                                                  |
* |         SE valendo 15% da nota                                                                  |
* |                                                                                                 |
* | • OBS: o cálculo final deve ser realizado em somente uma linha                                  |
* |                                                                                                 |
* |  • Boa sorte :)                                                                                 |
* O=================================================================================================O
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Abrindo um scannner para pegar os valores:
        Scanner scan = new Scanner(System.in);

        // Pegando valores:
        System.out.print("\nDigite a nota da Prova 1.\nR: ");
        float  P1 = Float.parseFloat(scan.nextLine());
        
        System.out.print("\n.Digite a nota do Trabalho 1.\nR: ");
        float  T1 = Float.parseFloat(scan.nextLine());
        
        System.out.print("\nDigite a nota do LE.\nR: ");
        float  LE = Float.parseFloat(scan.nextLine());
        
        
        System.out.print("\nDigite a nota da Prova 2.\nR: ");
        float  P2 = Float.parseFloat(scan.nextLine());
        
        System.out.print("\nDigite a nota do Trabalho 2.\nR: ");
        float  T2 = Float.parseFloat(scan.nextLine());
        
        System.out.print("\nDigite a nota do SE.\nR: ");
        float  SE = Float.parseFloat(scan.nextLine());

        // Fechando o scanner:
        scan.close();

        // Calculando:
        float MF = (((P1*0.6f)+(T1*0.3f)+(LE*0.1f)) + ((P2*0.5f)+(T2*0.35f)+(SE*0.15f)))/2;

        // Exibindo resultados:
        System.out.println("\nO----------------------------------------------O");
        System.out.println("+---------------------------+");
        System.out.println("| -> Bimestre 1:");
        System.out.println("|       P1 = " + P1 + ";");
        System.out.println("|       T1 = " + T1 + ";");
        System.out.println("|       LE = " + LE + ";");
        System.out.println("+--------------------+");
        System.out.println("| -> Bimestre 2:");
        System.out.println("|       P2 = " + P2 + ";");
        System.out.println("|       T2 = " + T2 + ";");
        System.out.println("|       SE = " + SE + ";");
        System.out.println("+--------------------------+");
        System.out.println("| -> Média final = " + MF + ";");
        System.out.println("+----------------------------------+");
        System.out.println("O--------------------------------------------O\n");
    }
}