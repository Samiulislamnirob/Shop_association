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

public class FootTrafficController {

    @FXML private TextField CampaignNameTextField;
    @FXML private ComboBox<String> CampaignTypeComboBox;
    @FXML private ComboBox<String> TargetAudienceComboBox;
    @FXML private DatePicker PromotionStartDateDatePicker;
    @FXML private DatePicker PromotionEndDateDatePicker;
    @FXML private TextField PromotionalContentTextField;
    @FXML private ComboBox<String> StatusComboBox;

    @FXML private TableColumn<FootTrafficData, String> CampaignNameTableColumn;
    @FXML private TableColumn<FootTrafficData, String> CampaignTypeTableColumn;
    @FXML private TableColumn<FootTrafficData, String> TargetAudienceTableColumn;
    @FXML private TableColumn<FootTrafficData, String> PromotionStartDateTableColumn;
    @FXML private TableColumn<FootTrafficData, String> PromotionEndDateTableColumn;
    @FXML private TableColumn<FootTrafficData, String> PromotionalContentTableColumn;
    @FXML private TableColumn<FootTrafficData, String> StatusTableColumn;

    private ObservableList<FootTrafficData> campaignList = FXCollections.observableArrayList();
    @FXML
    private Button GenerateButton;

    @FXML
    public void initialize() {
        CampaignTypeComboBox.setItems(FXCollections.observableArrayList("Discount", "Event", "New Arrival", "Special Offer"));
        TargetAudienceComboBox.setItems(FXCollections.observableArrayList("All Visitors", "Members Only", "First-time Visitors"));
        StatusComboBox.setItems(FXCollections.observableArrayList("Planned", "Ongoing", "Completed"));

        CampaignNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("campaignName"));
        CampaignTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("campaignType"));
        TargetAudienceTableColumn.setCellValueFactory(new PropertyValueFactory<>("targetAudience"));
        PromotionStartDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("promotionStartDate"));
        PromotionEndDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("promotionEndDate"));
        PromotionalContentTableColumn.setCellValueFactory(new PropertyValueFactory<>("promotionalContent"));
        StatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

//        tableView.setItems(campaignList);
    }

    @FXML
    private void GenerateButtonOnActrion() {
        String campaignName = CampaignNameTextField.getText().trim();
        String campaignType = CampaignTypeComboBox.getValue();
        String targetAudience = TargetAudienceComboBox.getValue();
        String startDate = PromotionStartDateDatePicker.getValue() != null ? PromotionStartDateDatePicker.getValue().toString() : "";
        String endDate = PromotionEndDateDatePicker.getValue() != null ? PromotionEndDateDatePicker.getValue().toString() : "";
        String promotionalContent = PromotionalContentTextField.getText().trim();
        String status = StatusComboBox.getValue();

        if (campaignName.isEmpty() || campaignType == null || targetAudience == null ||
                startDate.isEmpty() || endDate.isEmpty() || promotionalContent.isEmpty() || status == null) {
            showAlert("Error", "Please fill in all fields!");
            return;
        }

        FootTrafficData newCampaign = new FootTrafficData(
                campaignName, campaignType, targetAudience, startDate, endDate, promotionalContent, status
        );

        campaignList.add(newCampaign);
        clearForm();
        showAlert("Success", "Campaign data added successfully!");
    }

    private void clearForm() {
        CampaignNameTextField.clear();
        CampaignTypeComboBox.getSelectionModel().clearSelection();
        TargetAudienceComboBox.getSelectionModel().clearSelection();
        PromotionStartDateDatePicker.setValue(null);
        PromotionEndDateDatePicker.setValue(null);
        PromotionalContentTextField.clear();
        StatusComboBox.getSelectionModel().clearSelection();
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
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PresidentDashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();
    }
}
