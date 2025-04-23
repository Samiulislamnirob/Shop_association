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

public class FinancialReportwithTreasurer {

    @FXML
    private TextField ReportMonthTextField;
    @FXML
    private ComboBox<String> AccountComboBox;
    @FXML
    private TextArea TransactionDetailsTextArea;
    @FXML
    private TableColumn<FinancialReport, String> ReportMonthTableColumn;
    @FXML
    private TableColumn<FinancialReport, String> AccountTableColumn;
    @FXML
    private TableColumn<FinancialReport, String> TransactionDetailsTableColumn;

    private ObservableList<FinancialReport> reportList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Example accounts, customize or load from DB
        AccountComboBox.setItems(FXCollections.observableArrayList("Savings", "Checking", "Petty Cash"));

        ReportMonthTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportMonth"));
        AccountTableColumn.setCellValueFactory(new PropertyValueFactory<>("account"));
        TransactionDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("transactionDetails"));
//
//        tableView.setItems(reportList);
    }

    @FXML
    private void SubmitButton() {
        String reportMonth = ReportMonthTextField.getText();
        String account = AccountComboBox.getValue();
        String transactionDetails = TransactionDetailsTextArea.getText();

        if (reportMonth.isEmpty() || account == null || transactionDetails.isEmpty()) {
            showAlert("Validation Error", "Please fill all fields before submitting.");
            return;
        }

//        if (!vaildateRadioButton.isSelected() && !VerifyRadioButton.isSelected()) {
//            showAlert("Validation Error", "Please select either Validate or Verify.");
////            return;
//        }
//
//        FinancialReport newReport = new FinancialReport(reportMonth, account, transactionDetails);
//        reportList.add(newReport);
//
//        clearFields();
//    }
//
//    private void clearFields() {
//        ReportMonthTextField.clear();
//        AccountComboBox.setValue(null);
//        TransactionDetailsTextArea.clear();
//
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    public void vaildateRadioButton(ActionEvent actionEvent) {
    }

    @FXML
    public void VerifyRadioButton(ActionEvent actionEvent) {
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
