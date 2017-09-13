package Scheduled_task;

import java.util.TimerTask;

/**
 * Created by khoa on 9/13/2017.
 */
public class CustomTask extends TimerTask {

    public CustomTask() {

        //Constructor

    }

    public void run() {
        try {

            // Your task process
            System.out.println("CustomTask.run");

        } catch (Exception ex) {

            System.out.println("error running thread " + ex.getMessage());
        }
    }
}
