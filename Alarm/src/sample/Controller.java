package sample;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.Model.AlarmModel;
import sample.View.AlarmView;

public class Controller extends AlarmView{
    private final AlarmModel alarmModel = new AlarmModel();
    private final Date date = new Date();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField hoursField;

    @FXML
    private TextField minutesField;

    @FXML
    private TextField secondsField;

    @FXML
    private Button okBtn;

    @FXML
    void initialize() {
        alarm();
    }

    private void alert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alarm");
        alert.setHeaderText("Notify : ");
        alert.setContentText("Wake up сука ");
        alert.showAndWait();
    }

    private void alarm() {

        okBtn.setOnAction(event -> {
            if(hoursField.getText().isEmpty() || minutesField.getText().isEmpty() || secondsField.getText().isEmpty()) {
                alarmModel.setHours(0);
                alarmModel.setMinutes(0);
                alarmModel.setSeconds(0);
            } else {
                alarmModel.setHours(Integer.parseInt(hoursField.getText()));
                alarmModel.setMinutes(Integer.parseInt(minutesField.getText()));
                alarmModel.setSeconds(Integer.parseInt(secondsField.getText()));
            }

            if (System.currentTimeMillis() == alarmModel.t()) {
                alert();
            }

            System.out.println(System.currentTimeMillis());
            System.out.println(alarmModel.t());

            displayAlarmOutput(alarmModel.start());

        });
    }
}