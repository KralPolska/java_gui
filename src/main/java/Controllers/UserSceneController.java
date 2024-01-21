package Controllers;

import ObjectClasses.Bilety;
import ObjectClasses.Serializer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDateTime;

public class UserSceneController {

    @FXML private TableView<Bilety> TableBilety;
    @FXML private TableColumn<Bilety,Integer> bilet_ID;
    @FXML private TableColumn<Bilety,Integer> bilet_ID_Rozkladu;
    @FXML private TableColumn<Bilety,LocalDateTime> bilet_Data_waznosci;
    @FXML private TableColumn<Bilety,Double> bilet_Cena;

    @FXML private Button buyButton;
    @FXML private Button historyButton;

    @FXML private Button linesButton;
    @FXML private Button stopsButton;
    @FXML private Button howToGetButton;
    @FXML private Button infoButton;
    @FXML private Button editButton;
    @FXML private Button logoutButton;
    @FXML private Label usernameLabel;

    @FXML private VBox vbox_kup_bilet;
    @FXML private Button buyConfirm;
    @FXML private TextField creditcardnumber;

    @FXML private VBox vbox_historia;

    @FXML private VBox vbox_linie;
    @FXML private VBox vbox_rozklad;
    @FXML private VBox vbox_jak_dojade;

    @FXML private VBox vbox_info;
    @FXML private Pane pane_empty;
    @FXML private Label info_username;
    @FXML private Label info_password;
    @FXML private Label info_email;
    @FXML private Button editUsername;
    @FXML private Button editPassword;
    @FXML private Button editEmail;

    @FXML private VBox pane_editUsername;
    @FXML private TextField pane_editUsername_newUsername;
    @FXML private Button pane_editUsername_confirm;
    @FXML private Button pane_editUsername_discard;

    @FXML private VBox pane_editPassword;
    @FXML private TextField pane_editPassword_newPassword;
    @FXML private TextField pane_editPassword_newPasswordConfirm;
    @FXML private Button pane_editPassword_confirm;
    @FXML private Button pane_editPassword_discard;

    @FXML private VBox pane_editEmail;
    @FXML private TextField pane_editEmail_newEmail;
    @FXML private TextField pane_editEmail_newEmailConfirm;
    @FXML private Button pane_editEmail_confirm;
    @FXML private Button pane_editEmail_discard;
    private final String username = "admin";

    @FXML
    private void initialize() {
        vbox_historia.setVisible(false);
        vbox_kup_bilet.setVisible(false);
        vbox_linie.setVisible(false);
        vbox_rozklad.setVisible(false);
        vbox_jak_dojade.setVisible(false);
        vbox_info.setVisible(false);

        buyButton.setOnAction(event -> handleBuyButtonAction());
        historyButton.setOnAction(event -> handleHistoryButtonAction());
        linesButton.setOnAction(event -> handleLinesButtonAction());
        stopsButton.setOnAction(event -> handleStopsButtonAction());
        howToGetButton.setOnAction(event -> handleHowToGetButtonAction());
        infoButton.setOnAction(event -> handleInfoButtonAction());
        logoutButton.setOnAction(event -> handleLogoutButtonAction());
    }

    private void handleBuyButtonAction() {
        vbox_kup_bilet.setVisible(true);
        vbox_historia.setVisible(false);
        vbox_linie.setVisible(false);
        vbox_rozklad.setVisible(false);
        vbox_jak_dojade.setVisible(false);
        vbox_info.setVisible(false);

    }

    private void handleHistoryButtonAction() {
        vbox_kup_bilet.setVisible(false);
        vbox_historia.setVisible(true);
        vbox_linie.setVisible(false);
        vbox_rozklad.setVisible(false);
        vbox_jak_dojade.setVisible(false);
        vbox_info.setVisible(false);
    }

    private void handleLinesButtonAction() {
        vbox_kup_bilet.setVisible(false);
        vbox_historia.setVisible(false);
        vbox_linie.setVisible(true);
        vbox_rozklad.setVisible(false);
        vbox_jak_dojade.setVisible(false);
        vbox_info.setVisible(false);

    }

    private void handleStopsButtonAction() {
        vbox_kup_bilet.setVisible(false);
        vbox_historia.setVisible(false);
        vbox_linie.setVisible(false);
        vbox_rozklad.setVisible(true);
        vbox_jak_dojade.setVisible(false);
        vbox_info.setVisible(false);
    }

    private void handleHowToGetButtonAction() {
        vbox_kup_bilet.setVisible(false);
        vbox_historia.setVisible(false);
        vbox_linie.setVisible(false);
        vbox_rozklad.setVisible(false);
        vbox_jak_dojade.setVisible(true);
        vbox_info.setVisible(false);
    }

    private void handleInfoButtonAction() {
        vbox_kup_bilet.setVisible(false);
        vbox_historia.setVisible(false);
        vbox_linie.setVisible(false);
        vbox_rozklad.setVisible(false);
        vbox_jak_dojade.setVisible(false);
        vbox_info.setVisible(true);

        pane_editUsername.setVisible(false);
        pane_editPassword.setVisible(false);
        pane_editEmail.setVisible(false);
        pane_empty.setVisible(true);
    }

    private void handleLogoutButtonAction() {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainScene.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            Stage stage = (Stage) logoutButton.getScene().getWindow();

            stage.setScene(scene);
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
