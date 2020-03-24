package times.printer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class TimePrinter {
    private static int scheduleStopper = 5;
    private static final int MIN_NUM = 0;

    @Scheduled(cron = "*/2 * * * * *")
    public void print() {
        if (scheduleStopper > MIN_NUM) {
            printCurrentTime();
        } else {
            System.exit(0);
        }
    }

    private void printCurrentTime() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss")));
        scheduleStopper--;
    }
}