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
import javafx.stage.Stage;

import java.io.IOException;

public class ApproveNewShopApplications
{
    @javafx.fxml.FXML
    private Button submitButton;
    @javafx.fxml.FXML
    private TextArea ShopDetalisTextArea;
    @javafx.fxml.FXML
    private TableColumn<ShopApplication, String> ShopRegistrationTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ShopApplication, String> ApplicantNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ShopApplication, String> ShopDetalisTableColumn;
    @javafx.fxml.FXML
    private TextArea ShopRegistrationTextArea;
    @javafx.fxml.FXML
    private TableColumn<ShopApplication, String> ShopumnentsTableColumn;
    @javafx.fxml.FXML
    private TextField ApplicantNameTextField;
    @javafx.fxml.FXML
    private RadioButton RejectRadioCutton;
    @javafx.fxml.FXML
    private ComboBox<String> ShopumnentsComboBox;
    @javafx.fxml.FXML
    private RadioButton ApproveRadioButton;
    private ToggleGroup approvalGroup;

    private ObservableList<ShopApplication> applicationsList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        // ComboBox Sample Data
        ShopumnentsComboBox.setItems(FXCollections.observableArrayList("Documents Complete", "Documents Incomplete", "Pending Review"));

        // Table Columns Mapping
        ApplicantNameTableColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getApplicantName()));
        ShopDetalisTableColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getShopDetails()));
        ShopumnentsTableColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getShopumnents()));
        ShopRegistrationTableColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getShopRegistration()));

//        applicationTable.setItems(applicationsList);

        // ToggleGroup for RadioButtons
        approvalGroup = new ToggleGroup();
        ApproveRadioButton.setToggleGroup(approvalGroup);
        RejectRadioCutton.setToggleGroup(approvalGroup);

    }

    @javafx.fxml.FXML
    public void ApproveRadioButtonOnAction(ActionEvent actionEvent) {
        ShopRegistrationTextArea.setText("Application Approved.");
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        ShopRegistrationTextArea.setText("Application Rejected.");
    }

    @javafx.fxml.FXML
    public void RejectRadioCuttonOnAction(ActionEvent actionEvent) {
        String applicantName = ApplicantNameTextField.getText();
        String shopDetails = ShopDetalisTextArea.getText();
        String shopumnents = ShopumnentsComboBox.getValue();
        String shopRegistration = ShopRegistrationTextArea.getText();

        if (applicantName.isEmpty() || shopDetails.isEmpty() || shopumnents == null || shopRegistration.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input Validation");
            alert.setHeaderText(null);
            alert.setContentText("Please fill out all fields before submission!");
            alert.showAndWait();
            return;
        }

        ShopApplication newApplication = new ShopApplication(applicantName, shopDetails, shopumnents, shopRegistration);
        applicationsList.add(newApplication);

        // Clear input fields
        ApplicantNameTextField.clear();
        ShopDetalisTextArea.clear();
        ShopumnentsComboBox.getSelectionModel().clearSelection();
        ShopRegistrationTextArea.clear();
        approvalGroup.selectToggle(null);
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) throws IOException {  Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PresidentDashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();
    }
}