package aula6;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int i = numero;

        if (numero == 0) {
            fatorial = 1;
        } else {
            do {
                fatorial *= i;
                i--;
            } while (i > 1);
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}