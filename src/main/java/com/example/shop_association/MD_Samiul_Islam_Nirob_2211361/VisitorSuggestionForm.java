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

public class VisitorSuggestionForm {

    @FXML
    private TextField NameTextField;

    @FXML
    private TextField EmailTextField;

    @FXML
    private TextArea suggestionsTextArea;

    @FXML
    private ComboBox<String> SuggestionsTypeComboBox;

    @FXML
    private TableColumn<VisitorSuggestionFormData, String> NameTableColumn;

    @FXML
    private TableColumn<VisitorSuggestionFormData, String> EmailTableColumn;

    @FXML
    private TableColumn<VisitorSuggestionFormData, String> SuggestionsTableColumn;

    @FXML
    private TableColumn<VisitorSuggestionFormData, String> SuggestionTypeTableColumn;

    private ObservableList<VisitorSuggestionFormData> suggestionList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize table columns
        NameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        EmailTableColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        SuggestionsTableColumn.setCellValueFactory(new PropertyValueFactory<>("suggestions"));
        SuggestionTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("suggestionsType"));

        tableView.setItems(suggestionList);

        // Populate ComboBox with types
        SuggestionsTypeComboBox.setItems(FXCollections.observableArrayList(
                "General", "Complaint", "Improvement Idea", "Other"
        ));
    }

    @FXML
    private void SubmitButton() {
        String name = NameTextField.getText().trim();
        String email = EmailTextField.getText().trim();
        String suggestions = suggestionsTextArea.getText().trim();
        String suggestionsType = SuggestionsTypeComboBox.getValue();

        if (name.isEmpty() || email.isEmpty() || suggestions.isEmpty() || suggestionsType == null) {
            showAlert("Error", "All fields must be filled out!");
            return;
        }

        VisitorSuggestionFormData newSuggestion = new VisitorSuggestionFormData(name, email, suggestions, suggestionsType);
        suggestionList.add(newSuggestion);

        clearForm();
        showAlert("Success", "Suggestion submitted successfully!");
    }

    private void clearForm() {
        NameTextField.clear();
        EmailTextField.clear();
        suggestionsTextArea.clear();
        SuggestionsTypeComboBox.getSelectionModel().clearSelection();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) {  Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("VicePresidentDashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();
    }
}
