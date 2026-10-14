package aula3;

import java.util.Scanner;
public class Exercicio03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Digite o código do produto: 
                    1 - Eletronicos
                    2 - Alimentos
                    3 - Vestuários
                """);
        int codigo = scanner.nextInt();

        switch (codigo){
            case 1:
                System.out.println("Você escolheu o Eletronicos");
                break;
            case 2:
                System.out.println("Você escolheu o Alimentos");
                break;
            case 3:
                System.out.println("Você escolheu Vestuarios");
                break;
            default:
                System.out.println("Codigo invalido!");
                break;

        }
        scanner.close();
    }
}
