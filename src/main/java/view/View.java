package view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class View extends Application {
    private String title;
    private GridPane gridPane;
    private Parent parent;
    private double xOffset = 0;
    private double yOffset = 0;

    public View() {
        this.title = "Sign in to deker.org";

    }

    public void show() {
        launch();
    }



    @Override
    public void start(Stage primaryStage) throws IOException {
        //Name to Windows
        primaryStage.setTitle(title);

        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(530);

        primaryStage.setMaxWidth(400);
        primaryStage.setMaxHeight(530);

        primaryStage.getIcons().add(new Image("logo.png"));

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("login.fxml")));




        primaryStage.setScene(new Scene(root));



        primaryStage.show();
    }
}
