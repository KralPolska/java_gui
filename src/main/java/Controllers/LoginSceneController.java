package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.geometry.*;

public class LoginSceneController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label infoLabel;
    @FXML private Button loginButton;
    @FXML private Button backToMain;
    @FXML private CheckBox rememberMeCheckbox;

    String username;
    String password;

    @FXML
    private void initialize() {
        backToMain.setOnAction(event -> {
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainScene.fxml"));
                Parent root = loader.load();

                Scene scene = new Scene(root);

                Stage stage = (Stage) loginButton.getScene().getWindow();

                stage.setScene(scene);
            } catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        });
        loginButton.setOnAction(event -> {
            try{
                username = usernameField.getText(); //15 znaków sie miesic
                password = passwordField.getText(); //25 znaków

                if (username.equals("admin") && password.equals("admin")) {
                    infoLabel.setText("Zalogowano pomyslnie!");

                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/UserScene.fxml"));
                    Parent root = loader.load();

                    Scene scene = new Scene(root);

                    Stage stage = (Stage) loginButton.getScene().getWindow();

                    stage.setScene(scene);
                } else {
                    infoLabel.setText("Błędne dane logowania!");
                }
            } catch (Exception ee)
            {
                throw new RuntimeException(ee);
            }
        });
    }
}