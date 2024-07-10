package org.example.stocksimulator;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;


import java.io.IOException;
import java.util.ResourceBundle;

public class StockSimularDailySummary implements Initializable {

    private Parent root;
    private Scene scene;
    private Stage stage;

    @FXML
    private TableView<Stock> stockTable;

    @FXML
    private TableColumn<Stock, String> symbolCol;

    @FXML
    TableColumn<Stock, Double> openCol;

    @FXML
    private TableColumn<Stock, Double> closeCol;

    @FXML
    private TableColumn<Stock, Double> highCol;

    @FXML
    private TableColumn<Stock, Double> lowCol;

    @FXML
    private TableColumn<Stock, Integer> volumeCol;

    @FXML
    private ImageView saveImage;

    @FXML
    private ImageView returnImage;

    @FXML
    private ImageView nextImage;



    public void saveProgress(MouseEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Save Account");
        alert.setHeaderText("Saving account");
        alert.setContentText("Do you want to save your account?");

        if (alert.showAndWait().get() == ButtonType.OK){
            System.out.println("Progress saved successfully.");
        } else {
            System.out.println("Save progress operation canceled.");
        }
    }

    public void nextPage(MouseEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource(""));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void previousPage(MouseEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("hint.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        ObservableList<Stock> data = FXCollections.observableArrayList(
                new Stock("AAPL", 150.0, 152.5, 153.0, 149.5, 1000000),
                new Stock("GOOGL", 2700.0, 2720.0, 2725.0, 2695.0, 500000),
                new Stock("MSFT", 300.0, 305.0, 306.0, 299.0, 750000),
                new Stock("AMZN", 3500.0, 3550.0, 3560.0, 3480.0, 600000)
        );

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle){
            try {
                Image image = new Image(getClass().getResource("/Image/nextimage.jpeg").toExternalForm());
                nextImage.setImage(image);

                Image image2 = new Image(getClass().getResource("/Image/saveimage.jpeg").toExternalForm());
                saveImage.setImage(image2);

                Image image3 = new Image(getClass().getResource("/Image/returnimage.jpeg").toExternalForm());
                returnImage.setImage(image3);
            } catch (Exception e) {
                e.printStackTrace();
            }

            symbolCol.setCellValueFactory(new PropertyValueFactory<Stock, String>("symbol"));
            highCol.setCellValueFactory(new PropertyValueFactory<Stock, Double>("highPrice"));
            lowCol.setCellValueFactory(new PropertyValueFactory<Stock, Double>("lowPrice"));
            openCol.setCellValueFactory(new PropertyValueFactory<Stock, Double>("openPrice"));
            closeCol.setCellValueFactory(new PropertyValueFactory<Stock, Double>("closePrice"));
            volumeCol.setCellValueFactory(new PropertyValueFactory<Stock, Integer>("volume"));

            stockTable.setItems(data);
        }

}

