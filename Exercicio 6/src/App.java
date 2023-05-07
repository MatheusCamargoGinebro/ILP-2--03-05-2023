/*
* O=================================================================================================O
* | Exercício 6                                                                                     |
* |  • Escreva um programa que solicite ao usuário a altura e o raio de um cilindro circular e      |
* | imprima seu volume. Use a fórmula:                                                              |
* |                                                                                                 |
* |  • V = 3,14 * raio^2 * altura                                                                   |
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
        System.out.print("\nDigite o raio do cilindro.\nR: ");
        float raio = Float.parseFloat(scan.nextLine());
        
        System.out.print("\nDigite a altura do cilindro.\nR: ");
        float altura = Float.parseFloat(scan.nextLine());

        // Fechando o scanner:
        scan.close();
        
        // Calculando:
        float volume = 3.14f * raio*raio * altura;

        // Exibindo resultados:
        System.out.println("O Volume do cilindro é de " + volume + " unidade^3.");
    }
}