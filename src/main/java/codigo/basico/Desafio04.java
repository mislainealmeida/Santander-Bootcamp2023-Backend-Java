package codigo.basico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Valor inicial do investimento: ");
        double valorInicial = scanner.nextDouble();

        System.out.println("Taxa de juros: ");
        double taxaJuros = scanner.nextDouble();

        System.out.println("Quantidade de anos do investimento: ");
        int periodo = scanner.nextInt();

        double valorFinal = calcularJurosCompostos(valorInicial, taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        scanner.close();
    }

    public static double calcularJurosCompostos(double valorInicial, double taxaJuros, int periodo) {
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
        return valorFinal;
    }
}

