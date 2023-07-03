package main.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public void menuPrincipal(List<Lancamento> lista, User user) {
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

        }
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
            case 2:
                lista.add(new LancamentoReceita((String)array.get(1),
                        (Double)array.get(2), (Integer)array.get(3), (Integer)array.get(4), (Integer)array.get(5)));
        }

    }


}
