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
import java.time.LocalDate;

public class MarketingReport {

    @FXML
    private TextField CampaignNameTextField;

    @FXML
    private DatePicker StartDateDatePicker;

    @FXML
    private DatePicker EndDateDatePicker;

    @FXML
    private TableColumn<MarketingReportData, String> CampaignNameTableView;

    @FXML
    private TableColumn<MarketingReportData, LocalDate> StartdateTableView;

    @FXML
    private TableColumn<MarketingReportData, LocalDate> EndDateTableView;

    private ObservableList<MarketingReportData> campaignList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Link table columns with model fields
        CampaignNameTableView.setCellValueFactory(new PropertyValueFactory<>("campaignName"));
        StartdateTableView.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        EndDateTableView.setCellValueFactory(new PropertyValueFactory<>("endDate"));

        tableView.setItems(campaignList);
    }

    @FXML
    private void SaveButton() {
        String campaignName = CampaignNameTextField.getText().trim();
        LocalDate startDate = StartDateDatePicker.getValue();
        LocalDate endDate = EndDateDatePicker.getValue();

        if (campaignName.isEmpty() || startDate == null || endDate == null) {
            showAlert("Error", "All fields must be filled out!");
            return;
        }

        if (endDate.isBefore(startDate)) {
            showAlert("Date Error", "End Date cannot be before Start Date.");
            return;
        }

        MarketingReportData data = new MarketingReportData(campaignName, startDate, endDate);
        campaignList.add(data);
        clearForm();
        showAlert("Success", "Campaign added to the table!");
    }

    private void clearForm() {
        CampaignNameTextField.clear();
        StartDateDatePicker.setValue(null);
        EndDateDatePicker.setValue(null);
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
