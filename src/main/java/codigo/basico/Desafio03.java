package codigo.basico;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do saldo: ");
        int saldoTotal = scanner.nextInt();
        System.out.println("Digite o valor do saque: ");
        int valorSaque = scanner.nextInt();
        int novoSaldo;

        if(saldoTotal >= valorSaque){
            novoSaldo = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: "+novoSaldo);
        } else{
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
        scanner.close();
    }
}
