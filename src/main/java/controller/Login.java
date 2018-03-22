package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class Login {

    public GridPane gridPane;

    @FXML
    public void initialize(){
        Button button3 = new Button("faeda");

        Button button = new Button();
        button.setText("Test");
        //button.getStyleClass().add("button");
        button.setId("button2");

        Button button1 = new Button("adad");

        VBox vBox = new VBox();
        vBox.getChildren().add(button3);
        vBox.getChildren().add(button);
        vBox.getChildren().add(button1);

        gridPane.getChildren().add(vBox);
    }

}
