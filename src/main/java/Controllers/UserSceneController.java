package Controllers;

import ObjectClasses.BiletyMiesieczne;
import ObjectClasses.Serializer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.time.LocalDateTime;

public class UserSceneController {

    @FXML private Button buyButton;
    @FXML private Button historyButton;
    @FXML private Button extendButton;
    @FXML private Button linesButton;
    @FXML private Button stopsButton;
    @FXML private Button howToGetButton;
    @FXML private Button infoButton;
    @FXML private Button editButton;
    @FXML private Button logoutButton;
    @FXML private Label usernameLabel;
    private final String username = "admin";

    @FXML
    private void initialize() {
        usernameLabel.setText(username);

        buyButton.setOnAction(event -> handleBuyButtonAction());
        historyButton.setOnAction(event -> handleHistoryButtonAction());
        extendButton.setOnAction(event -> handleExtendButtonAction());
        linesButton.setOnAction(event -> handleLinesButtonAction());
        stopsButton.setOnAction(event -> handleStopsButtonAction());
        howToGetButton.setOnAction(event -> handleHowToGetButtonAction());
        infoButton.setOnAction(event -> handleInfoButtonAction());
        editButton.setOnAction(event -> handleEditButtonAction());
        logoutButton.setOnAction(event -> handleLogoutButtonAction());
    }

    private void handleBuyButtonAction() {
        BiletyMiesieczne biletyMiesieczne = new BiletyMiesieczne(1,"test", LocalDateTime.now(), LocalDateTime.now().plusMonths(1));

        Serializer serializer;
        Serializer.serializeObject(biletyMiesieczne,"obiekt.ser");


        BiletyMiesieczne nowy = new BiletyMiesieczne();
        nowy = Serializer.deserializeObject("obiekt.ser");
        assert nowy != null;
        System.out.println(nowy.getData_start()+" "+nowy.getData_koniec());
    }

    private void handleHistoryButtonAction() {
        // Logika dla przycisku "Historia"
    }

    private void handleExtendButtonAction() {
        // Logika dla przycisku "Przedluz"
    }

    private void handleLinesButtonAction() {
        // Logika dla przycisku "Linie"
    }

    private void handleStopsButtonAction() {
        // Logika dla przycisku "Przystanki"
    }

    private void handleHowToGetButtonAction() {
        // Logika dla przycisku "Jak dojade"
    }

    private void handleInfoButtonAction() {
        // Logika dla przycisku "Informacje"
    }

    private void handleEditButtonAction() {
        // Logika dla przycisku "Edycja"
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
