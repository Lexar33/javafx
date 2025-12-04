package com.jaar.readonlyprops;

import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        /*
        Constant constant =new Constant(100);
        constant.changeConstant();
        System.out.println(constant.getReadOnlyNumber().get());
         */
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label= new Label("Welcome");
        TextField field = new TextField();
        Button button = new Button("Bind label to Field");
        //TextField field1 = new TextField();
        field.setMaxWidth(300);
        //field.textProperty().addListener((obs,oldVal,newVal) -> {label.setText(newVal); });
        root.getChildren().addAll(label,field,button);
        //label.textProperty().bind(field.textProperty());
        //field1.textProperty().bindBidirectional(field.textProperty());
        button.setOnAction(actionEvent -> label.textProperty().bind(field.textProperty()));
        Scene scene= new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
