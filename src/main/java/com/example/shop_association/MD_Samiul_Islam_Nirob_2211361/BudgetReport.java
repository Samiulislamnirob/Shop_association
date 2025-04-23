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

import java.time.LocalDate;

public class BudgetReport {

    @FXML
    private TextField BudgetLimitTextField;

    @FXML
    private DatePicker DateDatePicker;

    @FXML
    private TextArea CategoryTextArea;

    @FXML
    private TableColumn<BudgetReportEntry, String> BudgetLimitTableColumn;

    @FXML
    private TableColumn<BudgetReportEntry, String> dateTableColumn;

    @FXML
    private TableColumn<BudgetReportEntry, String> CategoryTableView;

    private ObservableList<BudgetReportEntry> budgetEntries = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        BudgetLimitTableColumn.setCellValueFactory(new PropertyValueFactory<>("budgetLimit"));
        dateTableColumn.setCellValueFactory(cellData -> {
            if (cellData.getValue().getDate() != null) {
                return new javafx.beans.property.SimpleStringProperty(cellData.getValue().getDate().toString());
            } else {
                return new javafx.beans.property.SimpleStringProperty("No Date");
            }
        });
        CategoryTableView.setCellValueFactory(new PropertyValueFactory<>("category"));

//        tableView.setItems(budgetEntries);
    }

    @FXML
    private void SaveButton() {
        String budgetLimit = BudgetLimitTextField.getText();
        LocalDate date = DateDatePicker.getValue();
        String category = CategoryTextArea.getText();

        if (budgetLimit.isEmpty() || date == null || category.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Missing Information");
            alert.setHeaderText(null);
            alert.setContentText("Please complete all fields before saving!");
            alert.showAndWait();
            return;
        }

        BudgetReportEntry newEntry = new BudgetReportEntry(budgetLimit, date, category);
        budgetEntries.add(newEntry);

        // Clear input fields
        BudgetLimitTextField.clear();
        DateDatePicker.setValue(null);
        CategoryTextArea.clear();
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
