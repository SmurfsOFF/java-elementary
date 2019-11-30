package com.company.lesson7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) throws InterruptedException {
        Set<Order> orders=new TreeSet<>();
        Order order=new Order("test1",2,20.0,40.0,0.0);
        Thread.sleep(1000);
        Order order1=new Order("test1",2,20.0,40.0,0.0);
        Thread.sleep(1000);
        Order order2=new Order("test1",2,20.0,40.0,0.0);
        Thread.sleep(1000);

        orders.add(order);
        orders.add(order1);
        orders.add(order2);
        for (Order order3:orders){
            System.out.println(order3);
        }
    }
}
