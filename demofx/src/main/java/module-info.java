module demofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.jaar.mavenfx to javafx.fxml;
    exports com.jaar.mavenfx;

}