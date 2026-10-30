package aula6;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPares = 0;
        int totalImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        System.out.println("Quantidade de pares: " + totalPares);
        System.out.println("Quantidade de ímpares: " + totalImpares);

        scanner.close();
    }
}