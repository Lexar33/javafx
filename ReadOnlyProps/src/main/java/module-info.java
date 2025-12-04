module com.jaar.readonlyprops {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jaar.readonlyprops to javafx.fxml;
    exports com.jaar.readonlyprops;
}