package aula2.exercicios;

public class Exercicio02 {
    static void main(String[]args) {
        int horas = 10;
        int dias = 6;
        double hora_Trabalhada = 50;
        int semana = 0;
        semana = horas * dias;
        System.out.println("Aqui esta seu salario semanal: R$" + semana * hora_Trabalhada);
        System.out.println("Aqui está seu salario mensal: R$" + semana * hora_Trabalhada * 4);

    }
}
