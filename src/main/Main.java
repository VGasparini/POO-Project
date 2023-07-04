package main;

import main.domain.Lancamento;
import main.domain.Menu;
import main.domain.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Lancamento> lancamentos = new ArrayList<>();
        User user = new User();
        Menu menu = new Menu();
        Boolean online = true;

        while(online) {
            Boolean retorno =  menu.menuPrincipal(lancamentos, user);
            if (!retorno) {
                online = false;
            }
        }

    }
}
