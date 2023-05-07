/*
* O==========================================================================================O
* | Exercício 2.3                                                                            |
* |                                                                                          |
* | • Faça novamente a ficha cadastral do funcionário feita no exercício 2.2, porém agora,   |
* | faça com que o usuário entre com os dados. Guarde os dados em memória e depois exiba-os. |
* |                                                                                          |
* | • Boa sorte :)                                                                           |
* O==========================================================================================O
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        float salario;

        System.out.print("\nDigite seu nome.\nR: ");
        nome = scan.nextLine();
        
        System.out.print("\nDigite sua idade.\nR: ");
        idade = scan.nextInt();
        
        System.out.print("\nDigite seu salário.\nR: ");
        salario = scan.nextFloat();

        // OBS: Acho que esse comando não foi ensinado na aula, mas a IDE estava apitando, então eu coloquei :O (ele serve pra fechar o scanner que abrimos no inicio do código (pelo o que eu entendi));
        scan.close();

        System.out.println("\nO---------------------------------------------------O");
        System.out.println("| -> Nome do funcionário:" + nome + ".");
        System.out.println("| -> Idade do funcionário: " + idade + " Anos.");
        System.out.println("| -> Salário do funcionário: R$" + salario + ".");
        System.out.println("O---------------------------------------------------O\n");
    }
}
