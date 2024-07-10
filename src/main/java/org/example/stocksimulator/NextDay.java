package org.example.stocksimulator;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class NextDay {
    private Parent root;
    private Scene scene;
    private Stage stage;


    @FXML
    private ImageView saveImage;

    @FXML
    private ImageView returnImage;

    @FXML
    private ImageView nextImage;

    @FXML
    public void initialize() {
        Image image = new Image(getClass().getResourceAsStream("/Image/nextimage.jpeg"));
        nextImage.setImage(image);
        Image image2 = new Image(getClass().getResourceAsStream("/Image/saveimage.jpeg"));
        saveImage.setImage(image2);
        Image image3 = new Image(getClass().getResourceAsStream("/Image/returnimage.jpeg"));
        returnImage.setImage(image3);
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
            root = FXMLLoader.load(getClass().getResource("StockSimulatorDailySummary.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
}