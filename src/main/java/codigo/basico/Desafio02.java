package codigo.basico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ativos = new ArrayList<>();

        System.out.println("Digite a quantidade de ativos");
        int quantidadeAtivos = scanner.nextInt();
        // Limpar a nova linha após o número inteiro
        scanner.nextLine();

        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }
        Collections.sort(ativos);

        for (String ativo : ativos) {
            System.out.println(ativo);
        }

        scanner.close();
    }
}
