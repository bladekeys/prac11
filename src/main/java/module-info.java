module com.example.prac11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prac11 to javafx.fxml;
    exports com.example.prac11;
}