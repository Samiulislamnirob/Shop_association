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

public class MemberCommunication {

    @FXML
    private TextField ViolationReportIDTextField;

    @FXML
    private TextArea ReportIssueTextArea;

    @FXML
    private ComboBox<String> ValidationStatusComboBox;

    @FXML
    private TextArea AuditIssueTextArea;

    @FXML
    private TableColumn<MemberCommunicationData, String> VatidationReportIDTableCloumn;

    @FXML
    private TableColumn<MemberCommunicationData, String> ReportissueTableColumn;

    @FXML
    private TableColumn<MemberCommunicationData, String> ValidationStatusTableColumn;

    @FXML
    private TableColumn<MemberCommunicationData, String> AuditNotesTableColumn;

    private ObservableList<MemberCommunicationData> dataList = FXCollections.observableArrayList();

    private String status = "Unresolved";  // Default status
    @FXML
    private Button saveAuditButton;

    @FXML
    public void initialize() {
        ValidationStatusComboBox.setItems(FXCollections.observableArrayList("Valid", "Invalid", "Pending"));

        VatidationReportIDTableCloumn.setCellValueFactory(new PropertyValueFactory<>("violationReportID"));
        ReportissueTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportIssue"));
        ValidationStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("validationStatus"));
        AuditNotesTableColumn.setCellValueFactory(new PropertyValueFactory<>("auditNotes"));

        tableView.setItems(dataList);
    }

    @FXML
    private void OnActionResolvedRadioButton() {
        status = "Resolved";
    }

    @FXML
    private void OnActionUnResolvedRadioButton() {
        status = "Unresolved";
    }

    @FXML
    private void OnAction_Inprocess_RadioButton() {
        status = "In Progress";
    }

    @FXML
    private void OnActionSaveAuditButton() {
        String id = ViolationReportIDTextField.getText().trim();
        String issue = ReportIssueTextArea.getText().trim();
        String validation = ValidationStatusComboBox.getValue();
        String notes = AuditIssueTextArea.getText().trim();

        if (id.isEmpty() || issue.isEmpty() || validation == null || notes.isEmpty()) {
            showAlert("Error", "All fields must be filled!");
            return;
        }

        MemberCommunicationData data = new MemberCommunicationData(id, issue, validation + " [" + status + "]", notes);
        dataList.add(data);
        clearForm();
        showAlert("Success", "Audit details saved successfully!");
    }

    private void clearForm() {
        ViolationReportIDTextField.clear();
        ReportIssueTextArea.clear();
        ValidationStatusComboBox.getSelectionModel().clearSelection();
        AuditIssueTextArea.clear();
        status = "Unresolved";  // Reset status
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
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
