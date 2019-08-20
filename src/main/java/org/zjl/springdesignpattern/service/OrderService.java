package org.zjl.springdesignpattern.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.zjl.springdesignpattern.listener.OrderCreateEvent;

@Service
public class OrderService {

    @Autowired
    ApplicationContext applicationContext;
    //  创建订单
    public void saveOrder() {
        System.out.println("订单创建成功！");
        applicationContext.publishEvent(new OrderCreateEvent(applicationContext));
    }
}
