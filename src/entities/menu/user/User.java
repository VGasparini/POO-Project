package entities.menu.user;

import java.util.Scanner;

public class User {

    public String inputString() {
        Scanner input = new Scanner(System.in);
        String dado = input.nextLine();
        return dado;
    }
}
