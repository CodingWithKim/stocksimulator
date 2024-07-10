package org.example.stocksimulator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StockSimularDailySummary implements Initializable {

    private Parent root;
    private Scene scene;
    private Stage stage;

    @FXML
    private Button previousButton;

    @FXML
    private Button afterButton;

    @FXML
    private TableView<Stock> stockTable;

    @FXML
    private TableColumn<Stock, String> symbolCol;

    @FXML
    private TableColumn<Stock, Double> price;

    @FXML
    private TableColumn<Stock, Integer> volumeCol;

    @FXML
    private ImageView saveImage;

    @FXML
    private ImageView returnImage;

    @FXML
    private ImageView nextImage;

    private ObservableList<Stock> data = FXCollections.observableArrayList(
            new Stock("AAPL", 100, 1),
            new Stock("GOOGL", 170, 1),
            new Stock("MSFT", 200, 1),
            new Stock("AMZN", 250, 1)
    );

    @FXML
    private Label summaryLabel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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

        symbolCol.setCellValueFactory(new PropertyValueFactory<>("symbol"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        volumeCol.setCellValueFactory(new PropertyValueFactory<>("volume"));

        stockTable.setItems(data);

        summaryLabel.setText("Daily Summary: " + data.size() + " stocks traded");
    }

    public void saveProgress(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Save Account");
        alert.setHeaderText("Saving account");
        alert.setContentText("Do you want to save your account?");

        if (alert.showAndWait().orElse(ButtonType.CANCEL) == ButtonType.OK) {
            System.out.println("Progress saved successfully.");
        } else {
            System.out.println("Save progress operation canceled.");
        }
    }

    public void nextPage(MouseEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("nextDay.fxml")); // Replace with actual FXML file
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void previousPage(MouseEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("dayEnd.fxml")); // Replace with actual FXML file
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getPrevious(ActionEvent event) {
        //implement code
    }

    public void getAfter(ActionEvent event){
        //implement code
    }
}
