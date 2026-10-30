package aula6;

public class Exercicio06 {
    public static void main(String[] args) {
        int termoAnterior = 0;
        int termoAtual = 1;
        int contador = 1;

        System.out.println("Os primeiros 10 números de Fibonacci:");

        while (contador <= 10) {
            System.out.print(termoAnterior + " ");
            int proximo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = proximo;
            contador++;
        }
        System.out.println();
    }
}
