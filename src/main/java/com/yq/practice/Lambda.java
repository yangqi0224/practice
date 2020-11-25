package com.yq.practice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @author yangqi
 * @version 1.0
 * @class com.yq.practice.Lambda
 * @date 2020-11-24 15:24
 */
public class Lambda {

    public static void main(String[] args) {
        Apple a = new Apple(3,"red",3);
        Apple b = new Apple(4,"red",3);

        List<Apple> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.sort(((o1, o2) -> o1.getWeight()-o2.getWeight()));
        list.stream().filter(app->app.getWeight()==3).limit(3);
        list.forEach(System.out::println);
    }

}

interface Compare{
    boolean compare(Apple a);
}

class Apple{
    private int weight;
    private String color;
    private int price;

    public Apple() {
    }

    public void type(Compare compare){

    }

    public Apple(int weight, String color, int price) {
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}