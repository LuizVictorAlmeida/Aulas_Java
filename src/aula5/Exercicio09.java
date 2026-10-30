package aula5;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora atual (0 a 23): ");
        int hora = scanner.nextInt();

        if (hora >= 5 && hora < 12) {
            System.out.println("Turno: Manhã");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Turno: Tarde");
        } else if (hora >= 18 && hora < 22) {
            System.out.println("Turno: Noite");
        } else if ((hora >= 22 && hora <= 23) || (hora >= 0 && hora < 5)) {
            System.out.println("Turno: Madrugada");
        } else {
            System.out.println("Hora inválida! Digite um valor entre 0 e 23.");
        }

        scanner.close();
    }
}