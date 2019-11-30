package com.company.lesson7;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println("empty"+stack.empty());

        stack.push(10);
        stack.push(9);
        stack.push(8);
        System.out.println(stack.peek());



        Integer number= stack.pop();
        System.out.println("pop "+number);

        System.out.println("ins stack after pop:");
        for (Integer integer:stack){
            System.out.println(integer);
        }

        System.out.println("pop"+stack.pop());
        System.out.println("ins stack after pop:");
        for (Integer integer:stack){
            System.out.println(integer);
        }
    }
}
