import java.text.DecimalFormat;
public class Time {
    /**
     * Hours is an instant variable that assigns the number of hours of a given Time.
     * Minutes is an instant variable that assigns the number of minutes of the given Time.
     * Seconds is an instant variable athat assigns the number of seconds of the given Time.
     */
    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Sets a constructor to generate a given Time that can be displayed.
     * @param h initializes the number of hours for a given time
     * @param m initializes the number of minutes for a given time
     * @param s initializes the number of seconds for a given time
     */
    public Time(int h, int m, int s){
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    /**
     * Updates the time by incrementing time by one second.
     */
    public void tick(){
        seconds++;
        if(seconds >= 60) {
            seconds = seconds % 60;
            minutes++;
        }
        if(minutes >= 60) {
            minutes = minutes % 60;
            hours++;
        }
        if(hours >= 24){
            hours = hours % 24;
        }
    }

    /**
     * Adds the time of another time object to get a resultant time for the object that is called with this method.
     * @param other is an object that is used to add the time onto the object called.
     */
    public void add(Time other){
        hours = (hours + other.hours);
        minutes = (minutes + other.minutes);
        seconds = (seconds + other.seconds);
        if(hours >= 24) hours = hours % 24;
        if(minutes >= 60){
            hours++;
            minutes = minutes % 60;
        }
        if(seconds >= 60){
            minutes++;
            seconds %= 60;
        }
    }

    /**
     * Produces a string that contains what the time is of the given object.
     * @return Returns the time with 2 digits for your seconds, minutes, and hours.
     */
    public String toString(){
        DecimalFormat fix = new DecimalFormat("00");
        return fix.format(hours) + ":" + fix.format(minutes) + ":" + fix.format(seconds);
    }
}
