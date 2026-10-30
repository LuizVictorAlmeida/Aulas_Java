package aula5;

import java.util.Scanner;

public class Exercicio04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double venda = 0;
        double comissao = 0;
        System.out.println("Digite Valor da venda: ");
        venda = scanner.nextDouble();

        if(venda < 1000){
            comissao = venda * 0.05;
            System.out.println("5% de Comissão, Sua comissão é: R$ "+ comissao);
        } else if (venda <= 5000) {
            comissao = venda * 0.10;
            System.out.println("10% de Comissão, Sua comissão é: R$ "+ comissao);
        }
        else {
            comissao = venda * 0.15;
            System.out.println("15% de Comissão, Sua comissão é: R$ "+ comissao);
        }
        scanner.close();
    }
}
