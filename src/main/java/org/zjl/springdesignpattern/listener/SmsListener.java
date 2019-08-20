package org.zjl.springdesignpattern.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class SmsListener implements ApplicationListener<OrderCreateEvent> {

    @Override
    public void onApplicationEvent(OrderCreateEvent orderCreateEvent) {
        System.out.println("短信------>发送短信通知!");
    }
}
