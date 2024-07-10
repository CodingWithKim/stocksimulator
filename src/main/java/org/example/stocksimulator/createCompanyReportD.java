package org.example.stocksimulator;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class createCompanyReportD {
    @FXML
    private ImageView revenueImage;

    @FXML
    private ImageView chartDImage;

    @FXML
    private ImageView netprofit;

    @FXML
    private ImageView returnImage;

    private Parent root;
    private Scene scene;
    private Stage stage;


    @FXML
    public void initialize(){
        Image image = new Image(getClass().getResourceAsStream("/Image/revenue.jpeg"));
        revenueImage.setImage(image);
        Image image1 = new Image(getClass().getResourceAsStream("/Image/chartD.jpeg"));
        chartDImage.setImage(image1);
        Image image2 = new Image(getClass().getResourceAsStream("/Image/netprofit.jpeg"));
        netprofit.setImage(image2);
        Image image3 = new Image(getClass().getResourceAsStream("/Image/returnimage.jpeg"));
        returnImage.setImage(image3);
    }

    public void previousPage(MouseEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("specialEvent.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
