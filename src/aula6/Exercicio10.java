package aula6;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pares = "";
        String impares = "";

        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero > 100) {
                System.out.println("Número muito grande, interrupção realizada");
                break;
            }

            if (numero % 2 == 0) {
                pares += numero + " ";
                continue;
            }

            impares += numero + " ";
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);

        scanner.close();
    }
}