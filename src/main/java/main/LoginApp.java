package main;

import controller.StatusController;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.MySQL;
import view.LoginView;
import view.StatusView;

public class LoginApp {
    private String ip;
    private String table;
    private String user;
    private String password;

    private LoginApp(String ip, String table, String user, String password) {
        this.ip = ip;
        this.table = table;
        this.user = user;
        this.password = password;
    }

    private void startLoginApp() {

        MySQL mySQL = new MySQL(ip, table,user,password);

//        if (mySQL.checkConnect()) {
//            LoginView loginView = new LoginView();
//            loginView.show();
//        } else {
//            StatusView statusView = new StatusView(true);
//            statusView.show();
//        }

        StatusView statusView = new StatusView();
        statusView.show();




    }

    public static void main(String[] args)  {
        //Initialized mit MySQL Data
        LoginApp loginApp = new LoginApp("129.11.42.123","table","Deker","18757");

        //Start App
        loginApp.startLoginApp();
    }


}
