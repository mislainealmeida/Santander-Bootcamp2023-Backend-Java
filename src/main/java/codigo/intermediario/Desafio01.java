package codigo.intermediario;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();
        System.out.println("Saldo bancário: ");
        double saldo = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
        System.out.println("Informacoes:");
        System.out.println(conta);

        scanner.close();
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public  ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return  "Conta: " + numero + '\n' +
                "Titular: " + titular + '\n' +
                "Saldo: R$ " + saldo;
    }
}
