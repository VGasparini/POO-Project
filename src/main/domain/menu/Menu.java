package main.domain.menu;

import main.domain.lancamento.LancamentoBase;
import main.domain.lancamento.LancamentoDespesa;
import main.domain.lancamento.LancamentoReceita;
import main.domain.user.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Menu {

    public Boolean menuPrincipal(List<LancamentoBase> lista, User user, String caminhoDoArquivo) {
        System.out.println(
                "|---| Menu Principal |---|\n" +
                        "1 - Cadastrar Lançamento\n" + // Funcionando
                        "2 - Editar Lançamento\n" + // Funcionando
                        "3 - Remover Lançamento\n" + // Funcionando
                        "4 - Visualizar Lançamentos\n" + // Funcionando
                        "5 - Importar Arquivo\n" +
                        "6 - Exportar Arquivo\n" +
                        "7 - Sair do Programa"                  // Funcionando
        );
        switch (user.inputUserInteger()) {
            case 1:
                menuCriaLancamento(lista, user);
                break;
            case 2:
                menuEditarLancamento(lista, user);
                break;
            case 3:
                menuRemoveLancamento(lista, user);
                break;
            case 4:
                menuVisualizarLancamentos(lista);
                break;
            case 5:
                menuImportarArquivo(caminhoDoArquivo);
                break;
            case 7:
                System.out.println("Encerrando Programa...");
                return false;
        }
        return true;
    }

    public void menuCriaLancamento(List<LancamentoBase> lista, User user) {
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

        switch ((Integer) array.get(0)) {
            case 1:
                lista.add(new LancamentoDespesa((String) array.get(1),
                        (Double) array.get(2), (Integer) array.get(3), (Integer) array.get(4), (Integer) array.get(5)));
                break;
            case 2:
                lista.add(new LancamentoReceita((String) array.get(1),
                        (Double) array.get(2), (Integer) array.get(3), (Integer) array.get(4), (Integer) array.get(5)));
                break;
            default:
                System.out.println("Não foi adicionado nenhum lançamento!");
                break;
        }
    }

    public void menuEditarLancamento(List<LancamentoBase> lista, User user) {
        menuVisualizarLancamentos(lista);
        Integer lancamentoParaEditar;
        Integer tipoEditado;
        System.out.println("Digite o numero do lançamento que gostaria de editar:\n" +
                "Opção: ");
        lancamentoParaEditar = user.inputUserInteger();
        System.out.println("Qual campo gostaria de editar?\n" +
                "1 - Tipo\n" +
                "2 - Descrição\n" +
                "3 - Valor\n" +
                "4 - Vencimento\n" +
                "Opção: ");
        switch (user.inputUserInteger()) {
            case 1:
                System.out.println("Deseja alterar o lancamento para qual tipo?\n" +
                        "1 - DESPESA\n" +
                        "2 - RECEITA");
                tipoEditado = user.inputUserInteger();
                if (tipoEditado == 1) {
                    lista.add(lancamentoParaEditar - 1, new LancamentoDespesa(
                            lista.get(lancamentoParaEditar - 1).getDescricao(),
                            lista.get(lancamentoParaEditar - 1).getValor(),
                            lista.get(lancamentoParaEditar - 1).getVencimento()
                    ));
                } else {
                    lista.add(lancamentoParaEditar - 1, new LancamentoReceita(
                            lista.get(lancamentoParaEditar - 1).getDescricao(),
                            lista.get(lancamentoParaEditar - 1).getValor(),
                            lista.get(lancamentoParaEditar - 1).getVencimento()
                    ));
                }
                lista.remove(lancamentoParaEditar.intValue());
                break;

            case 2:
                System.out.println("Digite a nova descrição: ");
                lista.get(lancamentoParaEditar - 1).setDescricao(user.inputUserString());
                break;

            case 3:
                System.out.println("Digite o novo valor: ");
                lista.get(lancamentoParaEditar - 1).setValor(user.inputUserDouble());
                break;

            case 4:
                System.out.println("Deseja alterar:\n" +
                        "1 - Dia\n" +
                        "2 - Mês\n" +
                        "3 - Ano\n" +
                        "Opção: ");
                Integer valor;

                switch (user.inputUserInteger()) {
                    case 1:
                        System.out.println("Digite o novo dia: ");
                        valor = user.inputUserInteger();
                        lista.get(lancamentoParaEditar - 1).setVencimento(LocalDate.of(
                                lista.get(lancamentoParaEditar - 1).getVencimento().getYear(),
                                lista.get(lancamentoParaEditar - 1).getVencimento().getMonth(),
                                valor
                        ));
                        break;

                    case 2:
                        System.out.println("Digite o novo mês: ");
                        valor = user.inputUserInteger();
                        lista.get(lancamentoParaEditar - 1).setVencimento(LocalDate.of(
                                lista.get(lancamentoParaEditar - 1).getVencimento().getYear(),
                                valor,
                                lista.get(lancamentoParaEditar - 1).getVencimento().getDayOfMonth()
                        ));
                        break;

                    case 3:
                        System.out.println("Digite o novo ano: ");
                        valor = user.inputUserInteger();
                        lista.get(lancamentoParaEditar - 1).setVencimento(LocalDate.of(
                                valor,
                                lista.get(lancamentoParaEditar - 1).getVencimento().getMonth(),
                                lista.get(lancamentoParaEditar - 1).getVencimento().getDayOfMonth()
                        ));
                        break;
                }
                break;
        }
    }

    public void menuRemoveLancamento(List<LancamentoBase> lista, User user) {
        menuVisualizarLancamentos(lista);
        Integer lancamento;
        System.out.println("Digite qual lançamento gostaria de remover: ");
        lancamento = user.inputUserInteger();
        lista.remove(lancamento - 1);
    }

    public void menuVisualizarLancamentos(List<LancamentoBase> lista) {
        AtomicInteger i = new AtomicInteger();
        System.out.println("|   Tipo   | Descricao |   Valor  | Vencimento |");
        lista.forEach(lancamentoBase -> {
            i.addAndGet(1);
            String dataFormatada = lancamentoBase.getVencimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (lancamentoBase instanceof LancamentoDespesa) {
                System.out.printf(i.get() + "| %s | %10s | %.2f | %s |\n", "DESPESA", lancamentoBase.getDescricao(), lancamentoBase.getValor(), dataFormatada);
            } else {
                System.out.printf(i.get() + "| %s | %10s | %.2f | %s |\n", "RECEITA", lancamentoBase.getDescricao(), lancamentoBase.getValor(), dataFormatada);
            }
        });
    }

    private void menuImportarArquivo(String caminhoDoArquivo) {
        try {
            File file = new File(caminhoDoArquivo);

            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String linha = myReader.nextLine();
                String[] arrayDeDadosSeparadosPorVigula = linha.split(",");
                for (String dado : arrayDeDadosSeparadosPorVigula) {
                    System.out.println(dado.trim());
                }
                System.out.println(linha);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Arquivo não encontrado");
        }
    }

}
