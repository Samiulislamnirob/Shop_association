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

public class GeneralMeeting {

    @FXML private TextField MeetingTitleTextField, MeetingTimeTextField, MeetingAgendaTextField;
    @FXML private ComboBox<String> ParticipantListComboBox;
    @FXML private DatePicker MeetingDateDatePicker, ReminderScheduleDatePicker;
    @FXML private TextArea NotificationMessageTextArea;
    @FXML private TableColumn<GeneralMeetingData, String> MeetingTitleTableColumn, MeetingDateTableColumn,
            MeetingTimeTableColumn, MeetingAgendaTableColumn,
            ParticipantListTableColumn, ReminderScheduleTableColumn,
            NotificationMessageTableColumn;

    private ObservableList<GeneralMeetingData> meetingList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Sample participant data, replace this with your user list or DB later.
        ParticipantListComboBox.setItems(FXCollections.observableArrayList(
                "Management Team", "All Members", "Executives", "Special Guests"
        ));

        MeetingTitleTableColumn.setCellValueFactory(new PropertyValueFactory<>("meetingTitle"));
        MeetingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("meetingDate"));
        MeetingTimeTableColumn.setCellValueFactory(new PropertyValueFactory<>("meetingTime"));
        MeetingAgendaTableColumn.setCellValueFactory(new PropertyValueFactory<>("meetingAgenda"));
        ParticipantListTableColumn.setCellValueFactory(new PropertyValueFactory<>("participantList"));
        ReminderScheduleTableColumn.setCellValueFactory(new PropertyValueFactory<>("reminderSchedule"));
        NotificationMessageTableColumn.setCellValueFactory(new PropertyValueFactory<>("notificationMessage"));

        tableView.setItems(meetingList);
    }

    @FXML
    private void GenerateButtonOnAction() {
        String title = MeetingTitleTextField.getText();
        String date = MeetingDateDatePicker.getValue() != null ? MeetingDateDatePicker.getValue().toString() : "";
        String time = MeetingTimeTextField.getText();
        String agenda = MeetingAgendaTextField.getText();
        String participant = ParticipantListComboBox.getValue();
        String reminder = ReminderScheduleDatePicker.getValue() != null ? ReminderScheduleDatePicker.getValue().toString() : "";
        String message = NotificationMessageTextArea.getText();

        if (title.isEmpty() || date.isEmpty() || time.isEmpty() || agenda.isEmpty() || participant == null || reminder.isEmpty() || message.isEmpty()) {
            showAlert("Validation Error", "Please fill in all fields.");
            return;
        }

        GeneralMeetingData meeting = new GeneralMeetingData(
                title, date, time, agenda, participant, reminder, message
        );
        meetingList.add(meeting);
        clearFields();
    }

    private void clearFields() {
        MeetingTitleTextField.clear();
        MeetingDateDatePicker.setValue(null);
        MeetingTimeTextField.clear();
        MeetingAgendaTextField.clear();
        ParticipantListComboBox.setValue(null);
        ReminderScheduleDatePicker.setValue(null);
        NotificationMessageTextArea.clear();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
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
