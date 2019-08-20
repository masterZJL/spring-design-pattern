package org.zjl.springdesignpattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zjl.springdesignpattern.service.DalaoSaleService;
import org.zjl.springdesignpattern.service.MySaleService;
import org.zjl.springdesignpattern.service.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDesignPatternApplicationTests {

    @Autowired
    OrderService orderService;
    @Autowired
    MySaleService mySaleService;
    @Autowired
    DalaoSaleService dalaoSaleService;

    @Test
    public void contextLoads() {
        orderService.saveOrder();
    }

    /**
     * 使用mySaleService提供的服务，扩展性差，代码维护性差
     */
    @Test
    public void getFee1() {
        double normal = mySaleService.getFee("normal", 100);
        System.out.println("normal" + normal);
        double vip = mySaleService.getFee("vip", 100);
        System.out.println("vip" + vip);
        double svip = mySaleService.getFee("svip", 100);
        System.out.println("svip" + svip);
    }

    /**
     * 使用dalaoSaleService提供的服务，使用了工厂模式和策略模式，值得学习借鉴
     */
    @Test
    public void getFee2() {
        double normal = dalaoSaleService.getFee("normal", 100);
        System.out.println("normal" + normal);
        double vip = dalaoSaleService.getFee("vip", 100);
        System.out.println("vip" + vip);
        double svip = dalaoSaleService.getFee("svip", 100);
        System.out.println("svip" + svip);
    }
}
