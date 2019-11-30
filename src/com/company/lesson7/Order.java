package com.company.lesson7;

import java.util.Date;
import java.util.Objects;

public class Order implements Comparable<Order> {

    private static int ORDER_COUNT = 0;
    private Integer number;
    private String name;
    private Integer quantity;
    private Double price;
    private Double amount;
    private Double discount;
    private Date date;

    public Order() {

    }

    public Order(Integer number, String name, Integer quantity, Double price, Double amount, Double discount, Date date) {
        ORDER_COUNT++;
        this.number = ORDER_COUNT;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
        this.discount = discount;
        this.date = date;
    }

    public Order(String name, Integer quantity, Double price, Double amount, double discount) {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
        this.amount=amount;
        this.discount=discount;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getDiscount() {
        return discount;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public int compareTo(Order o) {

        if (this.date.getTime() < o.date.getTime()) {
            return -1;
        } else if (this.date.getTime() > o.date.getTime()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("name:%s, number:%d,date: %s,amount: %f ",
                this.getName(),this.getNumber(),this.getDate(),this.getAmount());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return number.equals(order.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}