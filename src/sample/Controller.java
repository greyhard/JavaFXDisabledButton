package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    @FXML
    Button ClickButton;

    @FXML
    public void nextStage() {
        System.out.println("Next");
        showStage("sample2.fxml");
        ClickButton.setDisable(false);
    }

    @FXML
    public void backStage() {
        System.out.println("Back");
        showStage("sample.fxml");
    }

    private void showStage(String fxml_source){
        Stage stage;
        Parent root = null;
        System.out.println("Display: "+fxml_source);
        stage = (Stage) ClickButton.getScene().getWindow();
        try {
            root = FXMLLoader.load(getClass().getResource(fxml_source));
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
