package codigo.basico;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do depósito: ");
        double valor = scanner.nextDouble();
        double saldo = 0.0;

        if (valor > 0) {
            saldo += valor;
            System.out.printf("Deposito realizado com sucesso!\nSaldo atual: R$  %.2f", saldo);
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");
        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
        scanner.close();
    }
}
