package com.example.shop_association.MD_Samiul_Islam_Nirob_2211361;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerFeedbackController
{
    @javafx.fxml.FXML
    private TextArea FeedbackTextArea;
    @javafx.fxml.FXML
    private TableColumn<CustomerFeedback, String> NameTableColumn;
    @javafx.fxml.FXML
    private TextField GmailtextField;
    @javafx.fxml.FXML
    private ComboBox<String> CategoryComboBox;
    @javafx.fxml.FXML
    private TextField NameTextField;
    @javafx.fxml.FXML
    private TableColumn<CustomerFeedback, String> CategoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerFeedback, String> GmailtableColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerFeedback, String> FeedbackTableColumn;

    private ObservableList<CustomerFeedback> feedbackList = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void initialize() {
        // Initialize Category ComboBox
        CategoryComboBox.setItems(FXCollections.observableArrayList("Service", "Product", "Support", "Other"));

        NameTableColumn.setCellValueFactory(new PropertyValueFactory<CustomerFeedback, String>("Name"));
        GmailtableColumn.setCellValueFactory(new PropertyValueFactory<CustomerFeedback, String>("Gmail"));
        CategoryTableColumn.setCellValueFactory(new PropertyValueFactory<CustomerFeedback, String>("Category"));
        FeedbackTableColumn.setCellValueFactory(new PropertyValueFactory<CustomerFeedback, String>("Feedback"));
        // Set up Table Columns

        // Bind data to TableView
//        feedbackTable.setItems(feedbackList);
    }

    @javafx.fxml.FXML
    public void GenerateButton(ActionEvent actionEvent) {
        String name = NameTextField.getText();
        String gmail = GmailtextField.getText();
        String category = CategoryComboBox.getValue();
        String feedback = FeedbackTextArea.getText();

        if (name.isEmpty() || gmail.isEmpty() || category == null || feedback.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input Validation");
            alert.setHeaderText(null);
            alert.setContentText("Please fill out all fields!");
            alert.showAndWait();
            return;
    }


    CustomerFeedback newFeedback = new CustomerFeedback(name, gmail, category, feedback);
        feedbackList.add(newFeedback);

    // Clear the input fields after adding
        NameTextField.clear();
        GmailtextField.clear();
        CategoryComboBox.getSelectionModel().clearSelection();
        FeedbackTextArea.clear();
    }

    @javafx.fxml.FXML
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