package codigo.intermediario;

import java.util.Scanner;
public class Desafio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite data, hora, descricao e valor");
        String entrada = scanner.nextLine();

        Transacao transacao = Transacao.parse(entrada);
        if (transacao != null) {
            transacao.imprimir();
        } else {
            System.out.println("Formato de entrada inválido. Use: data,hora,descricao,valor");
        }
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f%n", this.valor);
    }

    //a função parse lida com a conversão da string de entrada em argumentos que podem ser passados para o construtor da classe Transacao,
    // permitindo que você crie uma instância de Transacao a partir da entrada no formato de string.
    public static Transacao parse(String entrada) {
        String[] partes = entrada.split(",");
        if (partes.length == 4) {
            return new Transacao(partes[0], partes[1], partes[2], Double.parseDouble(partes[3]));
        }
        return null;
    }
}
