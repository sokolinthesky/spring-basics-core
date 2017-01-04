package com.yet.spring.core.logger;

import com.yet.spring.core.bean.Event;

public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event) {
        System.out.println(event.toString());
    }
}