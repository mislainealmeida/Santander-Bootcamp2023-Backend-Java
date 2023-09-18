package codigo.basico;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo atual: ");
        double saldoAtual = scanner.nextDouble();

        System.out.println("Valor depositado: ");
        double valorDeposito = scanner.nextDouble();

        System.out.println("Valor do saque: ");
        double valorRetirada = scanner.nextDouble();

        double novoSaldo = saldoAtual + (valorDeposito - valorRetirada);

        System.out.printf("Saldo atualizado na conta: %.1f\n", novoSaldo);

        scanner.close();
    }
}
