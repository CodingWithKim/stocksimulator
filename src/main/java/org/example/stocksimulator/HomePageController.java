package org.example.stocksimulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HomePageController {

    private Stage stage;
    private Scene scene;

    @FXML
    private Label nameLabel;
    @FXML
    private Button playButton;

    @FXML
    public void initialize() {
        // Set the current username (assuming UserSession provides the username)
        nameLabel.setText(UserSession.getInstance().getUsername());
    }

    @FXML
    public void handlePlay(ActionEvent event) throws IOException {
        System.out.println("Play Button Clicked!");
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("play1.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            // Handle file loading exception (e.g., display an error message)
            System.err.println("Error loading play scene: " + e.getMessage());
        }
    }

    @FXML
    public void handleCheckStatus(ActionEvent event) throws IOException {
        System.out.println("Check Status Button Clicked!");
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CheckStatus.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root, 600, 400); // Set scene size explicitly
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            // Handle file loading exception (e.g., display an error message)
            System.err.println("Error loading check status scene: " + e.getMessage());
        }
    }

    @FXML
    public void handleCreateNewUser(ActionEvent event) throws IOException {
        System.out.println("Create New User Button Clicked!");
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("createNewUser.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root, 600, 400); // Set scene size explicitly
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            // Handle file loading exception (e.g., display an error message)
            System.err.println("Error loading create new user scene: " + e.getMessage());
        }
    }
    @FXML
    private void handleChangeUser () {
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

