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

public class IncreasedFootTraffic {

    @FXML
    private TextField UserNameTextField;

    @FXML
    private TextField PasswordTextField;

    @FXML
    private TextArea categorySelectedTextArea;

    private ObservableList<IncreasedFootTrafficData> userList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Map Table Columns to Model Properties
        C1.setCellValueFactory(new PropertyValueFactory<>("userName"));
        C2.setCellValueFactory(new PropertyValueFactory<>("selectedCategories"));
        C3.setCellValueFactory(new PropertyValueFactory<>("promotionEligibility"));

        tableView.setItems(userList);

        // Group "Eligible" RadioButtons
        ToggleGroup eligibilityGroup = new ToggleGroup();
        EligibleYes.setToggleGroup(eligibilityGroup);
        EligibleNo.setToggleGroup(eligibilityGroup);
    }

    @FXML
    private void Login() {
        String user = UserNameTextField.getText().trim();
        String password = PasswordTextField.getText().trim();

        if (user.isEmpty() || password.isEmpty()) {
            showAlert("Login Failed", "Username or Password cannot be empty.");
            return;
        }

        // Placeholder logic: assuming any non-empty input is a valid login.
        showAlert("Login Successful", "Welcome, " + user + "!");
    }

    @FXML
    private void GenerateRecord() {
        String user = UserNameTextField.getText().trim();

        if (user.isEmpty()) {
            showAlert("Missing Data", "User name is required.");
            return;
        }

        StringBuilder selected = new StringBuilder();

        if (Clothing.isSelected()) selected.append("Clothing ");
        if (Electronics.isSelected()) selected.append("Electronics ");
        if (Home.isSelected()) selected.append("Home ");
        if (toys.isSelected()) selected.append("Toys ");

        String selectedCategories = selected.toString().trim();

        if (selectedCategories.isEmpty()) {
            showAlert("No Categories Selected", "Please select at least one preferred category.");
            return;
        }

        categorySelectedTextArea.setText(selectedCategories);

        String promotionStatus = EligibleYes.isSelected() ? "Yes" : EligibleNo.isSelected() ? "No" : "Not Selected";

        IncreasedFootTrafficData newData = new IncreasedFootTrafficData(user, selectedCategories, promotionStatus);
        userList.add(newData);

        showAlert("Record Added", "User's preferences have been saved.");
        clearForm();
    }

    private void clearForm() {
        UserNameTextField.clear();
        PasswordTextField.clear();
        categorySelectedTextArea.clear();

    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void backButton(ActionEvent actionEvent) {  Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PresidentDashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();
    }
}
