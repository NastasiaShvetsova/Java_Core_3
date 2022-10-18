package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        BoxWithFruit<Orange> or = new BoxWithFruit<>();
        BoxWithFruit<Orange> or1 = new BoxWithFruit<>();
        BoxWithFruit<Apple> ap = new BoxWithFruit<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();


        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        BoxWithFruit<Apple> box1 = new BoxWithFruit<>(apple1, apple2);
        BoxWithFruit<Orange> box2 = new BoxWithFruit<>(orange1, orange2, orange3);
        BoxWithFruit<Orange> box3 = new BoxWithFruit<>();

        //Задание №1
        System.out.println("Weight of fruit box: ");
        System.out.println("Box 1: " + box1.getWeight());
        System.out.println("Box 2: " + box2.getWeight());
        System.out.println("Box 3: " + box3.getWeight());


        //Задание №2
        System.out.println();
        System.out.println("Compare box: ");
        System.out.println(box1.compare(box2));

        //Задание №3
        box2.transfer(box3);

        System.out.println();
        System.out.println("Pour fruit from box2 to box3: ");
        System.out.println("Box 2: " + box2.getWeight());
        System.out.println("Box 3: " + box3.getWeight());

    }
}


