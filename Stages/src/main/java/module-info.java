module com.jaar.stages {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jaar.stages to javafx.fxml;
    exports com.jaar.stages;
}