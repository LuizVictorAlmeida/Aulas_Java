package aula5;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double reais = scanner.nextDouble();

        System.out.println("Escolha a moeda para conversão:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        System.out.print("Código: ");
        int moeda = scanner.nextInt();

        // Cotações de referência para o exercício
        double cotacaoDolar = 5.00;
        double cotacaoEuro = 5.50;
        double cotacaoLibra = 6.40;

        switch (moeda) {
            case 1:
                double valorDolar = reais / cotacaoDolar;
                System.out.println("Valor convertido: $ " + valorDolar);
                break;
            case 2:
                double valorEuro = reais / cotacaoEuro;
                System.out.println("Valor convertido: € " + valorEuro);
                break;
            case 3:
                double valorLibra = reais / cotacaoLibra;
                System.out.println("Valor convertido: £ " + valorLibra);
                break;
            default:
                System.out.println("Código de moeda inválido!");
                break;
        }

        scanner.close();
    }
}