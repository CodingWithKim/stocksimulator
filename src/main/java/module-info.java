module org.example.stocksimulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.stocksimulator to javafx.fxml;
    exports org.example.stocksimulator;
}