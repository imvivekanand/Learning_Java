package Exercise;
import java.util.*;
import java.text.*;

public class DigitalWatch {
    public static void main(String[] args) {
        // Create a new instance of SimpleDateFormat for formatting the time
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        // Create a Timer object to update the clock every second
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                // Get the current time and format it as a string
                Date now = new Date();
                String timeString = timeFormat.format(now);

                // Print the time to the console
                System.out.println(timeString);
            }
        }, 0, 1000);
    }
}
