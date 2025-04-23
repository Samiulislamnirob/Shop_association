package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class ShopFeedbackForm {

    @FXML
    private TextField ShopNameTextField;

    @FXML
    private TextField OwnersNameTextField;

    @FXML
    private TextArea FeedbackDetailsTextArea;

    @FXML
    private TableColumn<ShopFeedbackFormData, String> ShopnameTableColumn;

    @FXML
    private TableColumn<ShopFeedbackFormData, String> OwnersNametableColumn;

    @FXML
    private TableColumn<ShopFeedbackFormData, String> FeedbackTableColumn;

    private ObservableList<ShopFeedbackFormData> feedbackList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        ShopnameTableColumn.setCellValueFactory(new PropertyValueFactory<>("shopName"));
        OwnersNametableColumn.setCellValueFactory(new PropertyValueFactory<>("ownerName"));
        FeedbackTableColumn.setCellValueFactory(new PropertyValueFactory<>("feedback"));

        tableView.setItems(feedbackList);
    }

    @FXML
    private void SubmitTableColumn() {
        String shopName = ShopNameTextField.getText().trim();
        String ownerName = OwnersNameTextField.getText().trim();
        String feedback = FeedbackDetailsTextArea.getText().trim();

        if (shopName.isEmpty() || ownerName.isEmpty() || feedback.isEmpty()) {
            showAlert("Error", "Please fill in all fields!");
            return;
        }

        ShopFeedbackFormData feedbackData = new ShopFeedbackFormData(shopName, ownerName, feedback);
        feedbackList.add(feedbackData);

        clearForm();
        showAlert("Success", "Feedback submitted successfully!");
    }

    private void clearForm() {
        ShopNameTextField.clear();
        OwnersNameTextField.clear();
        FeedbackDetailsTextArea.clear();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {  Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("VicePresidentDashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();
    }
}
