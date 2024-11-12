module com.example.calculadoraarboles {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadoraarboles to javafx.fxml;
    exports com.example.calculadoraarboles;
}