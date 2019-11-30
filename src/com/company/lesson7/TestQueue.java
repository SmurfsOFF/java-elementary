package com.company.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) throws IOException {
        Queue<Order> queue=new PriorityQueue<>();

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String name=reader.readLine();
            if (name.equals("stop")){
                break;
            }
            Integer quantity=Integer.valueOf(reader.readLine());
            Double price=Double.valueOf(reader.readLine());
            Double amount=quantity*price;

            Order order=new Order(name,quantity,price,amount,0.0);

            System.out.println("We got order: ");
            System.out.println(order);
            queue.offer(order);
        }
        while (!queue.isEmpty()){
            System.out.println("process the order: ");
            System.out.println(queue.poll());
        }
    }
}
