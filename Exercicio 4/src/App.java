/*
* O============================================================================================O
* | Exercício 4                                                                                |
* | • Faça um programa que calcule, aproximadamente, quanto um fumante terá gasto com cigarros |
* | em N anos.                                                                                 |
* |                                                                                            |
* | • Boa sorte :)                                                                             |
* O============================================================================================O
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Abrindo Scanner e declarando variáveis:
        Scanner scan = new Scanner(System.in);
        int tempoFumando, qtdCigarros;
        float precoCigarro, totGasto;

        // Pegando valores:
        System.out.print("\nFaz quanto tempo que você fuma? (anos) \nR: ");
        tempoFumando = Integer.parseInt(scan.nextLine());
        
        System.out.print("\nQuantos cigarros você fuma por dia? (unidade)\nR: ");
        qtdCigarros = Integer.parseInt(scan.nextLine());
        
        System.out.print("\nQuanto custa o cigarro? (unidade)\nR: ");
        precoCigarro = Float.parseFloat(scan.nextLine());


        // Calculando:
        totGasto = precoCigarro*qtdCigarros*tempoFumando*365;
        
        // Fechando scanner:
        scan.close();

        // Exibino resultados:
        System.out.println("\nO--------------------------------------------------------O");
        System.out.println("| Você gastou R$"+ totGasto +" Com cigarros. Que feio!");
        System.out.println("O--------------------------------------------------------O\n");
    }
}
