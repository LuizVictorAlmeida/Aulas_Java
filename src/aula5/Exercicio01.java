package aula5;

import java.util.Scanner;

public class Exercicio01 {
    public void main(String[] args) {
        int idade = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite sua idade: ");
    idade = scanner.nextInt();

    if ( idade >= 18){
        System.out.println("Pode entrar!");
    } else {
        System.out.println("Não pode entrar!");
    }
        scanner.close();
    }
}
