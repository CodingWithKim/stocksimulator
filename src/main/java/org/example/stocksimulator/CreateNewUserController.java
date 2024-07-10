package org.example.stocksimulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

public class CreateNewUserController {
    @FXML
    private TextField newUsernameTextField;

    @FXML
    private Button createUserButton;
    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private SplitPane splitPane;


    @FXML
    private ImageView mainLogo, logo1;

    @FXML
    private ImageView logo2;

    @FXML
    private ImageView logo3;

    @FXML
    private ImageView logo4;

    @FXML
    private ImageView logo5;

    @FXML
    private ImageView logo6;


    @FXML
    private Label userNameLabel;

    @FXML
    public void initialize() {
        Image image = new Image(getClass().getResourceAsStream("/Image/businessmanlogo6.jpeg"));
        logo1.setImage(image);
        Image image1 = new Image(getClass().getResourceAsStream("/Image/businesswomanlogo2.jpeg"));
        logo2.setImage(image1);
        Image image2 = new Image(getClass().getResourceAsStream("/Image/businessmanlogo5.jpeg"));
        logo3.setImage(image2);
        Image image3 = new Image(getClass().getResourceAsStream("/Image/businessmanlogo2.jpeg"));
        logo4.setImage(image3);
        Image image4 = new Image(getClass().getResourceAsStream("/Image/businessmanlogo1.jpeg"));
        logo5.setImage(image4);
        Image image5 = new Image(getClass().getResourceAsStream("/Image/businessmanimage.jpeg"));
        logo6.setImage(image5);
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

    public void createUser(ActionEvent event){

        try {
            String name;
            name = newUsernameTextField.getText();
            userNameLabel.setText(name);
        }
        catch(NullPointerException e) {
            System.out.println("Cannot be null!");
        }
        catch (Exception e){
            System.out.println("Error ocurred!");
        }
    }

    @FXML
    private void getLogo1(MouseEvent event) {
        Image logo1 = new Image(getClass().getResourceAsStream("/Image/businessmanlogo6.jpeg"));
        mainLogo.setImage(logo1);
    }

    @FXML
    private void getLogo2(MouseEvent event) {
        Image logo2 = new Image(getClass().getResourceAsStream("/Image/businesswomanlogo2.jpeg"));
        mainLogo.setImage(logo2);
    }

    @FXML
    private void getLogo3(MouseEvent event) {
        Image logo3 = new Image(getClass().getResourceAsStream("/Image/businessmanlogo5.jpeg"));
        mainLogo.setImage(logo3);
    }

    @FXML
    private void getLogo4(MouseEvent event) {
        Image logo4 = new Image(getClass().getResourceAsStream("/Image/businessmanlogo2.jpeg"));
        mainLogo.setImage(logo4);
    }
    @FXML
    private void getLogo5(MouseEvent event) {
        Image logo5 = new Image(getClass().getResourceAsStream("/Image/businessmanlogo1.jpeg"));
        mainLogo.setImage(logo5);
    }

    @FXML
    private void getLogo6(MouseEvent event) {
        Image logo6 = new Image(getClass().getResourceAsStream("/Image/businessmanimage.jpeg"));
        mainLogo.setImage(logo6);
    }

    public void getUserName(ActionEvent event) throws IOException{
        String username = newUsernameTextField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("createNewUser.fxml")); //retireve info of scene2.fxml
        root = loader.load();
        CheckStatusContoller checkStatusContoller = loader.getController();
        checkStatusContoller.displayName(username);
    }



}
