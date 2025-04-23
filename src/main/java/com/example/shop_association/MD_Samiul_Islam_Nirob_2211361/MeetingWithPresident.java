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

public class MeetingWithPresident {

    @FXML
    private TextField ReportsTextField;

    @FXML
    private TextArea FuturePlansTextField;

    @FXML
    private TextArea SummaryTextArea;

    @FXML
    private TableColumn<MeetingWithPresidentData, String> ReportsTableView;

    @FXML
    private TableColumn<MeetingWithPresidentData, String> FuturePlansTableView;

    @FXML
    private TableColumn<MeetingWithPresidentData, String> SummaryTableView;

    private ObservableList<MeetingWithPresidentData> meetingList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        ReportsTableView.setCellValueFactory(new PropertyValueFactory<>("reports"));
        FuturePlansTableView.setCellValueFactory(new PropertyValueFactory<>("futurePlans"));
        SummaryTableView.setCellValueFactory(new PropertyValueFactory<>("summary"));

        tableView.setItems(meetingList);
    }

    @FXML
    private void SaveButton() {
        String reports = ReportsTextField.getText().trim();
        String futurePlans = FuturePlansTextField.getText().trim();
        String summary = SummaryTextArea.getText().trim();

        if (reports.isEmpty() || futurePlans.isEmpty() || summary.isEmpty()) {
            showAlert("Input Error", "All fields must be filled!");
            return;
        }

        MeetingWithPresidentData data = new MeetingWithPresidentData(reports, futurePlans, summary);
        meetingList.add(data);
        clearForm();
        showAlert("Success", "Meeting details saved!");
    }

    private void clearForm() {
        ReportsTextField.clear();
        FuturePlansTextField.clear();
        SummaryTextArea.clear();
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
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("VicePresidentDashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();
    }
}
