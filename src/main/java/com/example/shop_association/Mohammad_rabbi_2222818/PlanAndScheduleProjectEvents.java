package com.example.shop_association.Mohammad_rabbi_2222818;

public class PlanAndScheduleProjectEvents
{
    @javafx.fxml.FXML
    private Label EventTypeLabel;
    @javafx.fxml.FXML
    private TableColumn EventTypeTableColumn;
    @javafx.fxml.FXML
    private TextField EnterEventTitletextfield;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private Label EnterEventTitleTableLabel;
    @javafx.fxml.FXML
    private TextField EnterEventTitleTextField;
    @javafx.fxml.FXML
    private TableColumn EnterEventTitleTableColumn;
    @javafx.fxml.FXML
    private TableColumn DateTableColumn;
    @javafx.fxml.FXML
    private Label DateLabel;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    public PlanAndScheduleProjectEvents() {
    }

    public PlanAndScheduleProjectEvents(Label eventTypeLabel, TableColumn eventTypeTableColumn, TextField enterEventTitletextfield, DatePicker dateDatePicker, Label enterEventTitleTableLabel, TextField enterEventTitleTextField, TableColumn enterEventTitleTableColumn, TableColumn dateTableColumn, Label dateLabel, TableView tableView) {
        EventTypeLabel = eventTypeLabel;
        EventTypeTableColumn = eventTypeTableColumn;
        EnterEventTitletextfield = enterEventTitletextfield;
        this.dateDatePicker = dateDatePicker;
        EnterEventTitleTableLabel = enterEventTitleTableLabel;
        EnterEventTitleTextField = enterEventTitleTextField;
        EnterEventTitleTableColumn = enterEventTitleTableColumn;
        DateTableColumn = dateTableColumn;
        DateLabel = dateLabel;
        TableView = tableView;
    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
    }

    public Label getEventTypeLabel() {
        return EventTypeLabel;
    }

    public void setEventTypeLabel(Label eventTypeLabel) {
        EventTypeLabel = eventTypeLabel;
    }

    public TableColumn getEventTypeTableColumn() {
        return EventTypeTableColumn;
    }

    public void setEventTypeTableColumn(TableColumn eventTypeTableColumn) {
        EventTypeTableColumn = eventTypeTableColumn;
    }

    public TextField getEnterEventTitletextfield() {
        return EnterEventTitletextfield;
    }

    public void setEnterEventTitletextfield(TextField enterEventTitletextfield) {
        EnterEventTitletextfield = enterEventTitletextfield;
    }

    public DatePicker getDateDatePicker() {
        return dateDatePicker;
    }

    public void setDateDatePicker(DatePicker dateDatePicker) {
        this.dateDatePicker = dateDatePicker;
    }

    public Label getEnterEventTitleTableLabel() {
        return EnterEventTitleTableLabel;
    }

    public void setEnterEventTitleTableLabel(Label enterEventTitleTableLabel) {
        EnterEventTitleTableLabel = enterEventTitleTableLabel;
    }

    public TextField getEnterEventTitleTextField() {
        return EnterEventTitleTextField;
    }

    public void setEnterEventTitleTextField(TextField enterEventTitleTextField) {
        EnterEventTitleTextField = enterEventTitleTextField;
    }

    public TableColumn getEnterEventTitleTableColumn() {
        return EnterEventTitleTableColumn;
    }

    public void setEnterEventTitleTableColumn(TableColumn enterEventTitleTableColumn) {
        EnterEventTitleTableColumn = enterEventTitleTableColumn;
    }

    public TableColumn getDateTableColumn() {
        return DateTableColumn;
    }

    public void setDateTableColumn(TableColumn dateTableColumn) {
        DateTableColumn = dateTableColumn;
    }

    public Label getDateLabel() {
        return DateLabel;
    }

    public void setDateLabel(Label dateLabel) {
        DateLabel = dateLabel;
    }

    public TableView getTableView() {
        return TableView;
    }

    public void setTableView(TableView tableView) {
        TableView = tableView;
    }

    @Override
    public String toString() {
        return "PlanAndScheduleProjectEvents{" +
                "EventTypeLabel=" + EventTypeLabel +
                ", EventTypeTableColumn=" + EventTypeTableColumn +
                ", EnterEventTitletextfield=" + EnterEventTitletextfield +
                ", dateDatePicker=" + dateDatePicker +
                ", EnterEventTitleTableLabel=" + EnterEventTitleTableLabel +
                ", EnterEventTitleTextField=" + EnterEventTitleTextField +
                ", EnterEventTitleTableColumn=" + EnterEventTitleTableColumn +
                ", DateTableColumn=" + DateTableColumn +
                ", DateLabel=" + DateLabel +
                ", TableView=" + TableView +
                '}';
    }
}