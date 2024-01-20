package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterSceneController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private PasswordField confirmPasswordField;
    @FXML private TextField mailField;
    @FXML private TextField confirmMailField;
    @FXML private Label infoLabel;
    @FXML private Button registerButton;
    @FXML private Button backToMain;

    private Stage primaryStage;
    private Scene mainScene;
    private Scene loginScene;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void setMainScene(Scene mainScene) {
        this.mainScene = mainScene;
    }

    public void setLoginScene(Scene loginScene) {
        this.loginScene = loginScene;
    }

    @FXML
    private void initialize() {
        backToMain.setOnAction(event -> {
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainScene.fxml"));
                Parent root = loader.load();

                Scene scene = new Scene(root);

                Stage stage = (Stage) backToMain.getScene().getWindow();

                stage.setScene(scene);
            } catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        });
        registerButton.setOnAction(event -> {
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainScene.fxml"));
                Parent root = loader.load();

                Scene scene = new Scene(root);

                Stage stage = (Stage) backToMain.getScene().getWindow();

                stage.setScene(scene);
            } catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        });
    }
}

