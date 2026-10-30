package aula5;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double soma = num1 + num2;
                System.out.println("Resultado da soma: " + soma);
                break;
            case 2:
                double subtracao = num1 - num2;
                System.out.println("Resultado da subtração: " + subtracao);
                break;
            case 3:
                double multiplicacao = num1 * num2;
                System.out.println("Resultado da multiplicação: " + multiplicacao);
                break;
            case 4:
                if (num2 != 0) {
                    double divisao = num1 / num2;
                    System.out.println("Resultado da divisão: " + divisao);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}