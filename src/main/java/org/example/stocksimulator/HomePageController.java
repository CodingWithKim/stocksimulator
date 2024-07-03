package org.example.stocksimulator;

import javafx.fxml.FXML;

public class HomePageController {
    @FXML
    private void handlePlay() {
        System.out.println("Play Button CLicked!");
        // Implement logic to start the game
    }
    @FXML
    private void handleCheckStatus(){
        System.out.println("Check Status Button Clicked!");
        // Implement the code
    }

    @FXML
    private void handleCreateNewUser(){
        System.out.println("Create New User Button Clicked!");
        // Implement the code
    }
    @FXML
    public void handleExit(){
        System.out.println("Thanks for Playing! Have a good day!");
        System.exit(0);
    }
}