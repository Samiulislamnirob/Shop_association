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

public class EmergencyPlanModule {

    @FXML
    private TextArea ScenarioTextArea;

    @FXML
    private TableColumn<EmergencyPlan, String> ScenarioTableColumn;

    private ObservableList<EmergencyPlan> scenarioList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        ScenarioTableColumn.setCellValueFactory(new PropertyValueFactory<>("scenario"));
//        ScenarioTableView.setItems(scenarioList);
    }

    @FXML
    private void SaveButton() {
        String scenarioText = ScenarioTextArea.getText();

        if (scenarioText == null || scenarioText.trim().isEmpty()) {
            showAlert("Validation Error", "Scenario details cannot be empty.");
            return;
        }

        if (!ScenarioValidRadioButton.isSelected() && !PlanCompliantRadioButton.isSelected()) {
            showAlert("Validation Error", "Please select at least one validation option (Scenario Valid or Plan Compliant).");
            return;
        }

        EmergencyPlan newPlan = new EmergencyPlan(scenarioText);
        scenarioList.add(newPlan);

        ScenarioTextArea.clear();
        ScenarioValidRadioButton.setSelected(false);
        PlanCompliantRadioButton.setSelected(false);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void PlanCompliantRadioButton(ActionEvent actionEvent) {
    }

    @FXML
    public void ScenarioValidRadioButton(ActionEvent actionEvent) {
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
