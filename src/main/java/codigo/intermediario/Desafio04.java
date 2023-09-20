package codigo.intermediario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Desafio04{
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data inicial: ");
        String dataInicial = scanner.nextLine();
        System.out.println("Digite a data final: ");
        String dataFinal = scanner.nextLine();
        SistemaAcionistas sistema = new SistemaAcionistas();

        //a lista de descrições das análises é armazenada em analisesNoPeriodo
        List<String> analisesNoPeriodo = sistema.obterAnalisesDesempenho(dataInicial, dataFinal);

        for (String descricao : analisesNoPeriodo) {
            System.out.println("Descrição: " + descricao);
        }
    }
}
class SistemaAcionistas {
    private List<Analise> analises;

    public SistemaAcionistas() throws ParseException {
        analises = new ArrayList<>();
        //cria uma lista de análises:
        analises.add(new Analise("01/01/2023", "Analise de Desempenho Financeiro"));
        analises.add(new Analise("15/02/2023", "Analise de Riscos e Exposicoes"));
        analises.add(new Analise("31/03/2023", "Analises Corporativas"));
        analises.add(new Analise("01/04/2023", "Analise de Politicas e Regulamentacoes"));
        analises.add(new Analise("15/05/2023", "Analise de Ativos"));
        analises.add(new Analise("30/06/2023", "Analise de Inovacao e Tecnologia"));
    }

    public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
        //converter as strings de data como entrada em objetos Date
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicial = df.parse(dataInicialStr);
        Date dataFinal = df.parse(dataFinalStr);

        return analises.stream()
        //filtra o intervalo de data desejada
                .filter(analise -> {
                    Date data = analise.getData();
                    return data.compareTo(dataInicial) >= 0 && data.compareTo(dataFinal) <= 0;
                })
                .map(Analise::getDescricao)//pega apenas as descrições das análises que passaram pelo filtro
                .collect(Collectors.toList()); // retorna uma lista contendo as descrições do intervalo especificado
    }
}

class Analise {
    private Date data;
    private String descricao;

    public Analise(String dataStr, String descricao) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.data = df.parse(dataStr);
        this.descricao = descricao;
    }

    public Date getData() {
            return data;
        }

    public String getDescricao() {
            return descricao;
        }
}



