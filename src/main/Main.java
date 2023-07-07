package main;

import main.domain.lancamento.LancamentoBase;
import main.domain.menu.Menu;
import main.domain.user.User;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LancamentoBase> lancamentos = new ArrayList<>();
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
