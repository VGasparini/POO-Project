package main.java;

import java.util.Scanner;

public class Program {

    public void mainMenu() {
        System.out.println("|-- Menu Principal --|\n" +
                "Selecione uma das opções abaixo:\n" +
                "1 - Adicionar Tarefa\n" +
                "2 - Alterar Tarefa\n" +
                "3 - Remover Tarefa\n" +
                "4 - Importar arquivo\n" +
                "5 - Exportar arquivo\n" +
                "6 - Finalizar arquivo");
        Integer option = selectOption();
        chooseFunction(option);
    }
    public Integer selectOption() {
        Integer opcao;
        Scanner scanner = new Scanner(System.in);
        opcao = scanner.nextInt();
        return opcao;
    }
    public void chooseFunction(Integer opcao) {
        switch (opcao) {
            case 1:
                createTask();
            case 2:
                alterTask();
            case 3:
                removeTask();
            case 4:
                importFile();
            case 5:
                exportFile();
            default:
                break;
        }
    }
    public void createTask() {}
    public void alterTask() {}
    public void removeTask() {}
    public void importFile() {}
    public void exportFile() {}
}
