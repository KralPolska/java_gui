package Controllers;

import ObjectClasses.Login;
import ObjectClasses.Register;
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
                Register register = new Register(usernameField.getText(), passwordField.getText(), confirmPasswordField.getText(), mailField.getText(), confirmMailField.getText());
                String test = "nie";
                //RegisterClient client = new RegisterClient("adres_serwera", 1234);


                //User incomingUser = client.sendLogin(login);
                //client.closeConnection();
                //
                //incomingUser.getUsername().equals(username) && incomingUser.getId()!= -1
                if (test.equals("tak")) {
                    infoLabel.setText("Zalogowano pomyslnie!");

                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainScene.fxml"));
                    Parent root = loader.load();

                    Scene scene = new Scene(root);

                    Stage stage = (Stage) registerButton.getScene().getWindow();

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

