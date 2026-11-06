package aula7;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = {"Ana", "Bruno", "Carlos"};

        System.out.print("Digite o nome que deseja verificar: ");
        String busca = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome '" + busca + "' está presente no vetor.");
        } else {
            System.out.println("O nome '" + busca + "' não está presente no vetor.");
        }

        scanner.close();
    }
}
