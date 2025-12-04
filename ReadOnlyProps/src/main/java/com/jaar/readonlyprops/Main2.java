package com.jaar.readonlyprops;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main2 extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        ObservableList<String> list = FXCollections.observableArrayList("one", "two", "three");
        ListView<String> items = new ListView<String>();
        TextField field = new TextField();
        field.setMaxWidth(200);
        Button button = new Button("Add");
        items.setItems(list);
        button.setOnAction(e -> {
            if(!field.textProperty().get().isEmpty()){
                list.add(field.getText());
            }
        });
        root.getChildren().addAll(items,button,field);
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }


}
