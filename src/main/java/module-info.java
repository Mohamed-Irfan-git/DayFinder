module com.example.date {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.date to javafx.fxml;
    exports com.example.date;
}