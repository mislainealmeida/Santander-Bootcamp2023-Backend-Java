package codigo.intermediario;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tipo de cofre:");
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            System.out.println("Digite a senha:");
            int senha = scanner.nextInt();
            System.out.println("Digite a confirmação da senha:");
            int confirmacaoSenha = scanner.nextInt();

            CofreDigital digital = new CofreDigital(senha);
            digital.imprimirInformacoes();
            if (senha == confirmacaoSenha) {
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico fisico = new CofreFisico();
            fisico.imprimirInformacoes();
        } else {
            System.out.println("Tipo de cofre inválido.");
        }
        scanner.close();
    }

}

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {
    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {
    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }
}