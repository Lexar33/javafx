module jaar.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens jaar.demo to javafx.fxml;
    exports jaar.demo;
}