package main.domain;

import java.sql.SQLOutput;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public Boolean menuPrincipal(List<Lancamento> lista, User user) {
        System.out.println(
                "|---| Menu Principal |---|\n"        +
                "1 - Cadastrar Lançamento\n"          +
                "2 - Editar Lançamento\n"             +
                "3 - Remover Lançamento\n"            +
                "4 - Visualizar Lançamentos\n"        +
                "5 - Importar Arquivo\n"              +
                "6 - Exportar Arquivo\n"              +
                "7 - Sair do Programa"
                );
        switch (user.inputUserInteger()) {
            case 1:
                menuCriaLancamento(lista, user);
                break;
            case 4:
                menuVisualizarLancamentos(lista);
                break;
            case 7:
                System.out.println("Encerrando Programa...");
                return false;
        }
        return true;
    }
    public void menuCriaLancamento(List<Lancamento> lista, User user) {
        List<Object> array = new ArrayList<>();
        System.out.println("|---| Cadastrar Lançamento |---|\n" +
                           "1 - DESPESA\n" +
                           "2 - RECEITA\n" +
                           "Opção:");
        array.add(user.inputUserInteger());

        System.out.println("Digite uma descrição: ");
        array.add(user.inputUserString());

        System.out.println("Digite o valor: ");
        array.add(user.inputUserDouble());

        System.out.println("Selecione a data de vencimento:\n" +
                           "Digite o dia: ");
        array.add(user.inputUserInteger());
        System.out.println("Digite o mês: ");
        array.add(user.inputUserInteger());
        System.out.println("Digite o ano: ");
        array.add(user.inputUserInteger());

        switch ((Integer)array.get(0)) {
            case 1:
                lista.add(new LancamentoDespesa((String)array.get(1),
                        (Double)array.get(2), (Integer)array.get(3), (Integer)array.get(4), (Integer)array.get(5)));
                break;
                case 2:
                lista.add(new LancamentoReceita((String)array.get(1),
                        (Double)array.get(2), (Integer)array.get(3), (Integer)array.get(4), (Integer)array.get(5)));
                break;
            default:
                System.out.println("Não foi adicionado nenhum lançamento!") ;
                break;
        }

    }

    public void menuVisualizarLancamentos(List<Lancamento> lista) {
        System.out.println("|   Tipo   | Descricao |   Valor  | Vencimento |");
        lista.forEach(lancamento -> {
            String dataFormatada = lancamento.getVencimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (lancamento instanceof LancamentoDespesa) {
                System.out.printf("| %s | %10s | %.2f | %s |\n", "DESPESA", lancamento.getDescricao(), lancamento.getValor(), dataFormatada);
            }
            else {
                System.out.printf("| %s | %10s | %.2f | %s |\n", "RECEITA",lancamento.getDescricao(), lancamento.getValor(),dataFormatada);
            }
        });
    }

}
