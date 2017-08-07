package com.ssm.test;

import com.ssm.pojo.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    @Test
    public  void car(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("car.xml");
        Car car = ctx.getBean("car",Car.class);
        System.out.println(car.getName());
    }

}
