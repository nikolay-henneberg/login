package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StatusView extends Application {
    private boolean status;
    private String title;
    private GridPane gridPane;
    private Parent parent;
    private double xOffset = 0;
    private double yOffset = 0;

    public StatusView() {
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

        primaryStage.getIcons().add(new Image("image/logo.png"));

        Parent root = FXMLLoader.load((Objects.requireNonNull(getClass().getClassLoader().getResource("status.fxml"))));

        Scene scene = new Scene(root);

        scene.getStylesheets().add("style.css");

        primaryStage.setScene(scene);



        primaryStage.show();
    }
}
