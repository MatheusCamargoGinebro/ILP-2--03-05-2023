/*
* O===============================================================================================O
* | Exercício 3                                                                                   |
* |                                                                                               |
* | • Uma determinada loja dá 10% de desconto pra quem paga à vista e cobra 5% de juros para quem |
* | divide o valor total em 3 parcelas iguais.                                                    |
* |                                                                                               |
* | • Faça um programa em Java que vai ler o nome do produto, o valor do mesmo e mostrar na tela: |
* |     – O nome do produto                                                                       |
* |     – Quanto fica o valor do produto à vista                                                  |
* |     – Quanto fica o valor de cada uma das 3 parcelas                                          |
* |                                                                                               |
* | • Boa sorte :)                                                                                |
* O===============================================================================================O
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Abrindo Scanner e declarando variáveis:
        Scanner scan = new Scanner(System.in);
        String prodName;
        float prodValue, valueMode1, valueMode2, valueFraction;


        // Pegando valores:
        System.out.print("\nDigite o nome do produto.\nR: ");
        prodName = scan.nextLine();

        System.out.print("\nDigite o valor total do produto.\nR: ");
        prodValue = Float.parseFloat(scan.nextLine());

        // Calculando:
        valueMode1 = prodValue - (prodValue*0.1f);

        valueMode2 = prodValue + (prodValue*0.05f);

        valueFraction = valueMode2/3.0f;

        
        // Fechando scanner:
        scan.close();

        // Exibino resultados:
        System.out.println("\nO--------------------------------------------------------O");
        System.out.println("| -> Nome do produto: " + prodName + ".");
        System.out.println("| -> Valor pago a vista: R$" + valueMode1 + ".");
        System.out.println("| -> Valor pago parcelado: R$" + valueMode2 + ".");
        System.out.println("|   * O valor de cada parcela é: R$" + valueFraction + ".");
        System.out.println("O--------------------------------------------------------O\n");
    }
}
