package org.example.stocksimulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
<<<<<<< HEAD
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.EventObject;
=======
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
>>>>>>> 74564e93ce47adf75cdc27e3b9e9bd1802ce8b9e

public class HomePageController {

    private Stage stage;
    private Scene scene;

    @FXML
<<<<<<< HEAD
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
=======
    private Label nameLabel;
    @FXML
    private Button playButton; // Reference to any UI element in the current scene

    @FXML
    public void initialize() {
        // Set the current username
        nameLabel.setText(UserSession.getInstance().getUsername());
    }

    @FXML
    private void handlePlay() {
        System.out.println("Play Button Clicked!");
        // Implement logic to start the game
>>>>>>> 74564e93ce47adf75cdc27e3b9e9bd1802ce8b9e
    }

    @FXML
<<<<<<< HEAD
    private void handleCheckStatus(ActionEvent event) throws IOException {
=======
    private void handleCheckStatus() {
>>>>>>> 74564e93ce47adf75cdc27e3b9e9bd1802ce8b9e
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
<<<<<<< HEAD
    private void handleCreateNewUser(ActionEvent event) throws IOException{
=======
    private void handleCreateNewUser() {
>>>>>>> 74564e93ce47adf75cdc27e3b9e9bd1802ce8b9e
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
    private void handleChangeUser() {
        System.out.println("Change User Button Clicked!");
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("change-user.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); // Set the size to match the original window size
            Stage stage = (Stage) playButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleExit() {
        System.out.println("Thanks for Playing! Have a good day!");
        System.exit(0);
    }
}
