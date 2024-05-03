package org.example.module3.lesson5;

import static org.example.module3.lesson5.Logger.debug;
import static org.example.module3.lesson5.Logger.error;
import static org.example.module3.lesson5.Logger.warn;

public class Example1 {
    public static void main(String[] args) {
        Service service = new Service();
        service.method(1);
    }
}

class Service {

    public void method(int value) {

        debug("debug");
        // some logic
        warn("warn");
        error("error");
    }


}

// 1) loggers
// 2) appenders// file
// 3) layouts
//-------
//  2024-04-30 19:20:30:231 [..]   <message>
class Logger {

    private static LogLevel logLevel = LogLevel.ERROR;// read from property file

    //
    public static void log(String message, LogLevel logLevel) {
        System.out.println("[" + logLevel + "] " + "<date>" + message);
    }

    public static void debug(String message) {
        if (logLevel == LogLevel.DEBUG) {
            log(message, LogLevel.DEBUG);
        }
    }

    public static void warn(String message) {
        if (logLevel == LogLevel.WARN || logLevel == LogLevel.DEBUG) {
            log(message, LogLevel.WARN);
        }
    }

    public static void error(String message) {
        if (logLevel == LogLevel.ERROR || logLevel == LogLevel.WARN || logLevel == LogLevel.DEBUG) {
            log(message, LogLevel.ERROR);
        }
    }


}


enum LogLevel {
    DEBUG,
    WARN,
    ERROR
}