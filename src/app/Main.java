package app;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Запись из logger1");

        Logger logger2 = Logger.getInstance();
        logger2.log("Запись из logger2");


        System.out.println("Одинаковый экземпляр: " + (logger1 == logger2));


        List<String> logs = Logger.getInstance().getLogs();
        System.out.println("Все логи:");
        for (String entry : logs) {
            System.out.println(entry);
        }


        Runnable task = () -> Logger.getInstance().log("Запись из Runnable");
        task.run();


        System.out.println("Итоговые логи:");
        Logger.getInstance().getLogs().forEach(System.out::println);
    }
}