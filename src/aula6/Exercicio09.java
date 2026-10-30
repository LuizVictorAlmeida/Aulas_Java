package aula6;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gera número entre 1 e 100 usando casting e operadores básicos
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor!");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s).");

        scanner.close();
    }
}