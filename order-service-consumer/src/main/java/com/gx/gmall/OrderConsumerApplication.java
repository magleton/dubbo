package com.gx.gmall;

import com.gx.gmall.services.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class OrderConsumerApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.initOrder("2");
        System.out.println("调用完成....");
        System.in.read();
    }
}
