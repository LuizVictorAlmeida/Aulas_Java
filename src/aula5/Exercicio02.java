package aula5;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A o valor da compra (R$): ");
        double valorCompra = scanner.nextDouble();

        double valorFinal;

        if (valorCompra > 100.0) {
            double desconto = valorCompra * 0.10;
            valorFinal = valorCompra - desconto;
            System.out.println("Desconto de 10% aplicado!");
            System.out.println("Valor final a pagar: R$ " + valorFinal);
        } else {
            valorFinal = valorCompra;
            System.out.println("Sem desconto aplicado");
        }

        scanner.close();
    }
}