package org.zjl.springdesignpattern.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MailListener implements ApplicationListener<OrderCreateEvent> {

    @Override
    public void onApplicationEvent(OrderCreateEvent orderCreateEvent) {
        System.out.println("邮件------>发送邮件通知!");
    }
}
