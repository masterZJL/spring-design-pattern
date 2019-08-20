package org.zjl.springdesignpattern.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextRefreshedEvent;

public class OrderCreateEvent extends ApplicationContextEvent {
    public OrderCreateEvent(ApplicationContext source) {
        super(source);
    }
}
