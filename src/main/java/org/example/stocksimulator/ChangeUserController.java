package org.example.stocksimulator;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class ChangeUserController {
    @FXML
    private ListView<String> userListView;

    @FXML
    public void initialize() {
        // Load users into the ListView
        userListView.getItems().addAll("User1", "User2", "User3");
    }

    @FXML
    private void handleSelectUser() {
        String selectedUser = userListView.getSelectionModel().getSelectedItem();
        if (selectedUser != null) {
            System.out.println("Selected User: " + selectedUser);
            UserSession.getInstance().setUsername(selectedUser);
            navigateToHomePage();
        }
    }

    @FXML
    private void handleBack() {
        navigateToHomePage();
    }

    private void navigateToHomePage() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home-page.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); // Set the size to match the original window size
            Stage stage = (Stage) userListView.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
