module org.example.stocksimulator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.stocksimulator to javafx.fxml;
    exports org.example.stocksimulator;
}