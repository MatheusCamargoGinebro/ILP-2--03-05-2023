/*
* O=================================================================================================O
* | Exercício 7                                                                                     |
* |                                                                                                 |
* | • Escreva um programa que solicite ao usuário os dados necessários para se calcular o perímetro |
* | em metros lineares e a área em metros quadrados de um terreno retangular.                       |
* | • Realize estes cálculos e exiba os resultados finais ao usuário.                               |
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
        System.out.print("\nDigite o lado 1 do retângulo.\nR: ");
        float base = Float.parseFloat(scan.nextLine());

        System.out.print("\nDigite o lado 2 do retângulo.\nR: ");
        float altura = Float.parseFloat(scan.nextLine());

        // Fechando o scanner:
        scan.close();

        // Calculando:
        float perimetro = base + base + altura + altura;
        float area = base * altura;

        // Exibindo resultados:
        System.out.println("\nO-----------------------------------------------------O");
        System.out.println("| -> O perímetro do retângulo digitado é " + perimetro + ".");
        System.out.println("| -> A área do triângulo digitado é " + area + ".");
        System.out.println("O-----------------------------------------------------O\n");
    }
}