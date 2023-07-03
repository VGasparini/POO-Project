package main.domain;

import java.util.Scanner;

public class User {

    public String inputUserString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public Integer inputUserInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public Double inputUserDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
