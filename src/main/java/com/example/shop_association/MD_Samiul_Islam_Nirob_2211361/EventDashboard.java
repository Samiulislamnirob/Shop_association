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

public class EventDashboard {

    @FXML
    private TextArea TitleTextArea;

    @FXML
    private DatePicker DateDatePicker;

    @FXML
    private TableColumn<Event, String> TitleTableColumn;

    @FXML
    private TableColumn<Event, String> DateTableColumn;

    private ObservableList<Event> eventList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        TitleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        DateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
//        EventTableView.setItems(eventList);
    }

    @FXML
    private void SaveButton() {
        String title = TitleTextArea.getText();
        LocalDate date = DateDatePicker.getValue();

        if (title == null || title.trim().isEmpty()) {
            showAlert("Validation Error", "Event Title cannot be empty.");
            return;
        }
        if (date == null) {
            showAlert("Validation Error", "Please select a valid date.");
            return;
        }

//        if (!PlanCompleteRadioButton.isSelected() && !ResourcesVerifiedRadioButton.isSelected()) {
//            showAlert("Validation Error", "Select at least one option: Plan Complete or Resources Verified.");
//            return;
//        }

        Event newEvent = new Event(title, date);
        eventList.add(newEvent);

        TitleTextArea.clear();
        DateDatePicker.setValue(null);
//        PlanCompleteRadioButton.setSelected(false);
//        ResourcesVerifiedRadioButton.setSelected(false);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void ResourcesVerifiedRadioButton(ActionEvent actionEvent) {
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) {
    }

    @FXML
    public void PlanCompleteRadioButton(ActionEvent actionEvent) throws IOException {  Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("VicePresidentDashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();
    }
}
