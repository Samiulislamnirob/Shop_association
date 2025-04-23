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

public class NewMemberApplication {

    @FXML
    private TextField NameTextField;

    @FXML
    private TextField EmailTextField;

    @FXML
    private TextField phoneTextField;

    @FXML
    private TextArea DocumentsTextArea;

    @FXML
    private TableColumn<NewMemberApplicationData, String> NameTableColumn;

    @FXML
    private TableColumn<NewMemberApplicationData, String> EmailTableColumn;

    @FXML
    private TableColumn<NewMemberApplicationData, String> PhoneTableColumn;

    @FXML
    private TableColumn<NewMemberApplicationData, String> DocumentsTableColumn;

    private ObservableList<NewMemberApplicationData> applicationList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        NameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        EmailTableColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        PhoneTableColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
        DocumentsTableColumn.setCellValueFactory(new PropertyValueFactory<>("documents"));

        tableView.setItems(applicationList);
    }

    @FXML
    private void ApproveButton() {
        String name = NameTextField.getText().trim();
        String email = EmailTextField.getText().trim();
        String phone = phoneTextField.getText().trim();
        String documents = DocumentsTextArea.getText().trim();

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || documents.isEmpty()) {
            showAlert("Error", "All fields must be filled!");
            return;
        }

        NewMemberApplicationData newMember = new NewMemberApplicationData(name, email, phone, documents);
        applicationList.add(newMember);

        clearForm();
        showAlert("Success", "New member application approved and added to the list!");
    }

    private void clearForm() {
        NameTextField.clear();
        EmailTextField.clear();
        phoneTextField.clear();
        DocumentsTextArea.clear();
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
