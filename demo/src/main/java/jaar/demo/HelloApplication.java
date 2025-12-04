package jaar.demo;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void stop() throws Exception {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Closing the application");
    }

    @Override
    public void start(Stage stage){
        Platform.setImplicitExit(false);


        VBox root= new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20,20,20,40));
        root.setSpacing(20);
        Label label = new Label(":):)):)");
        Button button = new Button("Click Me");
        Button button1 = new Button("Exit explicitly");
        button.setOnAction(e -> label.setText("Bienvenido a JavaFx app"));

        button1.setOnAction(event -> {
            Platform.exit();
        });


        root.getChildren().addAll(label,button,button1);
        Scene scene = new Scene(root,350,430);
        stage.setScene(scene);
        stage.setTitle("Jose Alexandeerrr");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}