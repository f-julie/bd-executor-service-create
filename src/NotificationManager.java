

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NotificationManager {

    /**
     * Method called to send notifications out.
     * @param tasks List of NotificationTasks tasks to be run
     */
    public void sendSaleNotificationsOut(List<NotificationTask> tasks) {
        //Implement this method
        // Create an ExecutorService with a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(3); // Adjust the number of threads as needed

        try {
            // Submit each NotificationTask to the ExecutorService
            for (NotificationTask task : tasks) {
                executorService.submit(task);
            }
        } finally {
            // Shutdown the ExecutorService
            executorService.shutdown(); // Initiate an orderly shutdown
        }
    }

}
