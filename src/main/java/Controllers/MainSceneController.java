package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainSceneController {

    @FXML private Button loginButton;
    @FXML private Button registerButton;
    @FXML private Button exitButton;

    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    private void initialize() {
        loginButton.setOnAction(event -> {
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/LoginScene.fxml"));
                Parent root = loader.load();

                Scene scene = new Scene(root);

                Stage stage = (Stage) loginButton.getScene().getWindow();

                stage.setScene(scene);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        });
        registerButton.setOnAction(event -> {
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/RegisterScene.fxml"));
                Parent root = loader.load();

                Scene scene = new Scene(root);

                Stage stage = (Stage) registerButton.getScene().getWindow();

                stage.setScene(scene);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        });
        exitButton.setOnAction(event -> {
            Stage stage = (Stage) exitButton.getScene().getWindow();
            stage.close();
        });
    }
}