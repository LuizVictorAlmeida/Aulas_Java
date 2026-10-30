package aula5;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor da hora normal: ");
        double valorHora = scanner.nextDouble();

        if (horasTrabalhadas > 40) {
            double horasExtras = horasTrabalhadas - 40;
            double valorHoraExtra = valorHora * 1.5;
            double totalHoraExtra = horasExtras * valorHoraExtra;

            System.out.println("Foram realizadas " + horasExtras + " horas extras.");
            System.out.println("Valor a ser pago pelas horas extras: R$ " + totalHoraExtra);
        } else {
            System.out.println("Não houve horas extras realizadas.");
        }

        scanner.close();
    }
}