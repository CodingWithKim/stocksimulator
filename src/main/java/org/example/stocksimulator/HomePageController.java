package org.example.stocksimulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.EventObject;

public class HomePageController {

    private Stage stage;
    private Scene scene;

    @FXML
    private void handlePlay(ActionEvent event) throws IOException{
        System.out.println("Play Button CLicked!");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("play1.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleCheckStatus(ActionEvent event) throws IOException {
        System.out.println("Check Status Button Clicked!");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CheckStatus.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleCreateNewUser(ActionEvent event) throws IOException{
        System.out.println("Create New User Button Clicked!");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("createNewUser.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void handleExit(){
        System.out.println("Thanks for Playing! Have a good day!");
        System.exit(0);
    }
}