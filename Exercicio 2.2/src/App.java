/*
* O=====================================================================================O
* | • Use as variáveis declaradas no exercício 2.1 para apresentar uma ficha cadastral  |
* | do funcionário com a estrutura abaixo trocando o que está em vermelho pelo conteúdo |
* | de sua respectiva variável.                                                         |
* |                                                                                     |
* | • FUNCIONARIO DO MÊS                                                                |
* |     Nome: <nome>                                                                    |
* |     Idade: <idade> anos                                                             |
* |     Salário: R$ <salario> (salário bruto)                                           |
* |                                                                                     |
* | • Boa sorte :)                                                                      |
* O=====================================================================================O
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        String nome = "Matheus Camargo Ginebro";
        int idade = 16;
        float salario = 4096.81f;

        System.out.println("\nO---------------------------------------------------O");
        System.out.println("| -> Nome do funcionário:" + nome + ".");
        System.out.println("| -> Idade do funcionário: " + idade + " Anos.");
        System.out.println("| -> Salário do funcionário: R$" + salario + ".");
        System.out.println("O---------------------------------------------------O\n");
    }
}
