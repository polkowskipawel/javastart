package Main;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private int mmillisecond;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setMmillisecond(int mmillisecond) {
        this.mmillisecond = mmillisecond;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getMmillisecond() {
        return mmillisecond;
    }

    int hourTominute(int hour){
        return hour*60;
    }
    int minuteTosecond(int minute){
        return minute*60;
    }
    int secondToMillisecond(int second){
        return second*60;
    }
}
