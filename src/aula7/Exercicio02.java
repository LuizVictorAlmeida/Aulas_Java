package aula7;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] caracteres = {"a", "b", "c", "d", "e", "f"};

        System.out.print("Digite uma letra para pesquisar: ");
        String busca = scanner.next();

        boolean encontrado = false;

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i].equalsIgnoreCase(busca)) {
                System.out.println("Letra encontrada na posição (índice): " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("A letra não foi encontrada no vetor.");
        }

        scanner.close();
    }
}