package entities.menu;

import entities.menu.user.User;

public class Menu {

    public void mainMenu(User user) {
        System.out.println(
                "|-----| Menu Principal |-----|" +
                "1 - Cadastrar Tarefa"      +
                "2 - Cadastrar Status"      +
                "3 - Visualizar Tarefas"    +
                "4 - Importar Arquivo"      +
                "5 - Exportar Arquivo"      +
                "6 - Sair do Sistema"
        );
    }

}
