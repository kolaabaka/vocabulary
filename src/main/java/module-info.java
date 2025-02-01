module com.fx.vocabulary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fx.vocabulary to javafx.fxml;
    exports com.fx.vocabulary;
}