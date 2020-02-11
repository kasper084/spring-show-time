package times;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import times.config.AppConfig;
import times.printer.TimePrinter;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TimePrinter printer = context.getBean(TimePrinter.class);
        printer.print();
    }
}