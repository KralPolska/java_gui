package Controllers;

import ObjectClasses.Login;
import ObjectClasses.Serializer;
import ObjectClasses.User;
import ServerConnection.LoginClient;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.*;

public class LoginSceneController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label infoLabel;
    @FXML private Text test;
    @FXML private Button loginButton;
    @FXML private Button backToMain;
    @FXML private CheckBox rememberMeCheckbox;

    String username;
    String password;

    Integer id;

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
                Login login = new Login(usernameField.getText(),passwordField.getText());
                username = usernameField.getText();
                //LoginClient client = new LoginClient("127.0.0.1", 1234);

                //wysyłanie "login.ser" do serwera
                //User incomingUser = client.sendLogin(login);
                //client.closeConnection();
                //
                //incomingUser.getUsername().equals(username) && incomingUser.getId()!= -1
                if (true) {
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