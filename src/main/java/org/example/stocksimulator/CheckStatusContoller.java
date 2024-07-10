package org.example.stocksimulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;


import java.io.IOException;

public class CheckStatusContoller {

    @FXML
    private Label currentProgressLabel, totalBalanceLabel, returnLabel, userNameLabel;

    @FXML
    private Button deleteAccountButton;

    @FXML
    private SplitPane splitPane;

    @FXML
    private AnchorPane pane;

    @FXML
    private Circle returnCircle;
    private ImageView imageView;
    private Scene scene;
    private Parent root;
    private Stage stage;

    public void getCurrentProgress(ActionEvent event){

        //implement code

    }

    public void getTotalBalance(ActionEvent event){

        //implement code

    }

    public void returnToHomePage(MouseEvent event){
        try {
            root = FXMLLoader.load(getClass().getResource("home-page.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void displayName(String username){
        userNameLabel.setText(username);
    }

    public void deleteAccount(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete Account");
        alert.setHeaderText("Deleting account");
        alert.setContentText("Do you wan to delete your account?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            if(splitPane != null) {
                stage = (Stage) splitPane.getScene().getWindow();
                System.out.println("Account is deleted");

                Parent root = FXMLLoader.load(getClass().getResource("home-page.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            else{
                System.out.println("Initialization error");
            }
        }
    }
}
