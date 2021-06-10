package sample.View;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AlarmView {

    @FXML private Label alarmOutput;

    /*
        * Function for return  on display info about time in hh:mm:ss format
        * @param s the input time string
        * @return void
     */

    protected void displayAlarmOutput(String s) {
        alarmOutput.setText(s);
    }
}
