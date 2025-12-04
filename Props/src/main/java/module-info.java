module com.jaar.props {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jaar.props to javafx.fxml;
    exports com.jaar.props;
}