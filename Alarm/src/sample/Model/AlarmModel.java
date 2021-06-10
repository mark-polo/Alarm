package sample.Model;

public class AlarmModel {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /*
     * Function for return  on display info about time in hh:mm:ss format whose will be use in displayAlarmOutput()
     * @return info about time in hh:mm:ss format
     */

    public String start() {
        return getHours() + " : " + getMinutes() + " : " + getSeconds();
    }

    /*
     * Function for couting time in millisecond
     * @return long data result of counting current time with input data
     */

    public long t() {
        if(getHours() == -1 || getMinutes() == -1 || getSeconds() == -1) {
            setHours(0);
            setMinutes(0);
            setSeconds(0);
        }
        return System.currentTimeMillis() + getHours() + getMinutes() + getSeconds();
    }

}
