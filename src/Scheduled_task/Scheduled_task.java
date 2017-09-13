package Scheduled_task;

import java.util.Calendar;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * Created by khoa on 9/13/2017.
 */
public class Scheduled_task {
    public static void scheDuled_task() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(
                Calendar.DAY_OF_WEEK,
                Calendar.MONDAY
        );
//        calendar.set(Calendar.HOUR_OF_DAY, 15);
//        calendar.set(Calendar.MINUTE, 40);
        calendar.set(Calendar.SECOND, 0);
//        calendar.set(Calendar.MILLISECOND, 0);



        Timer time = new Timer(); // Instantiate Timer Object

        // Start running the task on Monday at 15:40:00, period is set to 8 hours
        // if you want to run the task immediately, set the 2nd parameter to 0
        time.schedule(new CustomTask(), calendar.getTime(), TimeUnit.MINUTES.toMillis(1));
    }
}
