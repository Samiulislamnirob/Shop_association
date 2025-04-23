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

public class EventRegistrations {

    @FXML
    private TextField NameTextField;
    @FXML
    private DatePicker DateDatePicker;
    @FXML
    private TextArea DescriptionTextArea;
    @FXML
    private TableColumn<EventRegistration, String> NameTableColumn;
    @FXML
    private TableColumn<EventRegistration, String> dateTableColumn;
    @FXML
    private TableColumn<EventRegistration, String> DescriptionTableColumn;
    @FXML
    private TableColumn<EventRegistration, String> PublicTableColumn;

    private ObservableList<EventRegistration> registrationList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        NameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        DescriptionTableColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        PublicTableColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

//        tableView.setItems(registrationList);
    }

    @FXML
    private void save_Button() {
        String name = NameTextField.getText();
        LocalDate date = DateDatePicker.getValue();
        String description = DescriptionTextArea.getText();
//        String type = PublicRadioButton.isSelected() ? "Public" : NoRadioButton.isSelected() ? "No" : "";

//        if (name.isEmpty() || date == null || description.isEmpty() || type.isEmpty()) {
//            showAlert("Validation Error", "All fields must be filled and a type must be selected.");
//            return;
//        }

        EventRegistration newRegistration = new EventRegistration(name, date, description, type);
        registrationList.add(newRegistration);

        // Clear fields after saving
        NameTextField.clear();
        DateDatePicker.setValue(null);
        DescriptionTextArea.clear();
//        PublicRadioButton.setSelected(false);
//        NoRadioButton.setSelected(false);
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    public void PublicRadioButton(ActionEvent actionEvent) {
    }

    @FXML
    public void NoRadioButton(ActionEvent actionEvent) {
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
