/*
* O=================================================================================================O
* | Exercício 5                                                                                     |
* | • Faça um programa que calcule quantos anos, meses, dias, minutos e segundos a pessoa já viveu, |
* | aproximadamente, com base em seu ano de nascimento.                                             |
* |                                                                                                 |
* | • Boa sorte :)                                                                                  |
* O=================================================================================================O
 */

import java.util.Scanner;

// Só pra trabalhar com tempo :V
import java.time.*;

public class App {
    public static void main(String[] args) {
        // Abrindo um scannner para pegar os valores:
        Scanner scan = new Scanner(System.in);

        // Pegando valores:
        System.out.print("\nDigite o ano em que você nasceu.\nR: ");
        int year = Integer.parseInt(scan.nextLine());
        
        System.out.print("\nDigite o mês em que você nasceu.\nR: ");
        int month = Integer.parseInt(scan.nextLine());
        
        System.out.print("\nDigite o dia em que você nasceu.\nR: ");
        int day = Integer.parseInt(scan.nextLine());
        
        System.out.print("\nDigite a hora em que você nasceu.\nR: ");
        int hour = Integer.parseInt(scan.nextLine());
        
        System.out.print("\nDigite o minuto em que você nasceu.\nR: ");
        int minute = Integer.parseInt(scan.nextLine());
        
        System.out.print("\nDigite o segundo em que você nasceu.\nR: ");
        int second = Integer.parseInt(scan.nextLine());

        // Fechando o scanner:
        scan.close();

        // Calculando datas:
        LocalDateTime birthDateTime = LocalDateTime.of(year, month, day, hour, minute, second);
        LocalDateTime now = LocalDateTime.now();

        Period livedTimePeriod = Period.between(birthDateTime.toLocalDate(), now.toLocalDate());
        Duration livedTimeDuration = Duration.between(birthDateTime, now);
        
        // Exibindo resultados:
        System.out.print("Você já viveu " + livedTimePeriod.getYears() +" anos, " + livedTimePeriod.getMonths() + " meses, " + livedTimePeriod.getDays() + " dias, " + livedTimeDuration.toHoursPart() + " horas, " + livedTimeDuration.toMinutesPart() + " minutos e " + livedTimeDuration.toSecondsPart() + " segundos.\n");
    }
}