package main.domain;

public class Menu {

    public void menuPrincipal() {
        User user = new User();
        System.out.println(
                "|---| Menu Principal |---|"        +
                "1 - Cadastrar Lançamento"          +
                "2 - Editar Lançamento"             +
                "3 - Remover Lançamento"            +
                "4 - Importar Arquivo"              +
                "5 - Exportar Arquivo"              +
                "6 - Sair do Programa"
                );
        user.inputUserInteger();
    }


}
