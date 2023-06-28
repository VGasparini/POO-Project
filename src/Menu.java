import java.util.Scanner;

public class Menu {

    public void menuPrincipal() {
        System.out.println("|-- Menu Principal --|\n" +
                            "Selecione uma das opções abaixo:"
                            "1 - Adicionar Tarefa\n" +
                            "2 - Alterar Tarefa\n" +
                            "3 - Remover Tarefa\n" +
                            "4 - Importar arquivo");
        Integer opcao = selecionaOpcao();
        escolheTarefa(opcao);
    }
    public Integer selecionaOpcao() {
        Integer opcao;
        Scanner scanner = new Scanner(System.in);
        opcao = scanner.nextInt();
        return opcao;
    }
    public void escolheTarefa(Integer opcao) {
        switch (opcao) {
            case 1:
                criaTarefa();
            case 2:
                alteraTarefa();
            case 3:
                removeTarefa();
            case 4:
                importaArquivo();

        }
    }
}
