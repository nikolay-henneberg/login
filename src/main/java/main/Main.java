package main;

import view.View;

public class Main {
    private View viewLogin;

    private String start(){
        viewLogin = new View();
        viewLogin.show();

        System.out.println("Test");

        return "";
    }

    public static void main(String[] args)  {
        Main main = new Main();
        main.start();
    }
}
