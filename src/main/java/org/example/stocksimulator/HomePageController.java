package org.example.stocksimulator;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {
    @FXML
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
    }

    @FXML
    private void handleCheckStatus() {
        System.out.println("Check Status Button Clicked!");
        // Implement the code
    }

    @FXML
    private void handleCreateNewUser() {
        System.out.println("Create New User Button Clicked!");
        // Implement the code
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
