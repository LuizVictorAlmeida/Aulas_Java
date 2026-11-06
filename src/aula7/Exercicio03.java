package aula7;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] valores = new boolean[8];
        int contagemTrue = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite true ou false para a posição " + i + ": ");
            valores[i] = scanner.nextBoolean();

            if (valores[i]) {
                contagemTrue++;
            }
        }

        System.out.println("Total de valores 'true' inseridos: " + contagemTrue);

        scanner.close();
    }
}
