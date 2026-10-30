package aula6;

public class Exercicio02 {
    public static void main(String[] args) {
        int contador = 1;
        int soma = 0;

        while (contador <= 100) {
            if (contador % 2 == 0) {
                soma += contador;
            }
            contador++;
        }

        System.out.println("Soma dos números pares de 1 a 100: " + soma);
    }
}