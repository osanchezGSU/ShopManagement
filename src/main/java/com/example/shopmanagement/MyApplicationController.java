package com.example.shopmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MyApplicationController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Label companyLabel;

    @FXML
    private Button customersButton;

    @FXML
    private Button dashboardButton;

    @FXML
    private Button historyButton;

    @FXML
    private Button inventoryButton;

    @FXML
    private Button newInvoiceButton;

    @FXML
    private Button savedInvoiceButton;
    SwitchScenes sc = new SwitchScenes();

    @FXML
    void switchToCustomers(ActionEvent event) throws IOException {
        sc.switchToScene(event, "customers-page.fxml", borderPane);

    }

    @FXML
    void switchToDashboard(ActionEvent event) throws IOException {
        sc.switchToScene(event, "dashboard-page.fxml", borderPane);
    }

    @FXML
    void switchToHistory(ActionEvent event) throws IOException {
        sc.switchToScene(event, "history-page.fxml", borderPane);
    }

    @FXML
    void switchToInventory(ActionEvent event) throws IOException {
        sc.switchToScene(event, "inventory-page.fxml", borderPane);
    }

    @FXML
    void switchToNewInvoice(ActionEvent event) throws IOException {
        sc.switchToScene(event, "new-invoice-page.fxml", borderPane);
    }

    @FXML
    void switchToSavedInvoice(ActionEvent event) throws IOException {
        sc.switchToScene(event, "saved-invoice-page.fxml", borderPane);
    }

}
