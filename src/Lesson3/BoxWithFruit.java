package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class BoxWithFruit<T extends Fruit> {
    private ArrayList<T> objects;

    public BoxWithFruit() {
        this.objects = new ArrayList<>();
    }

    public BoxWithFruit(T... objects) {
        this.objects = new ArrayList<T>(Arrays.asList(objects));
    }

    public void add(T... objects) {
        this.objects.addAll(Arrays.asList(objects));
    }

    public void remove(T... fruitList) {
        for (T object : objects) this.objects.remove(object);
    }

    public ArrayList<T> getFruitList() {
        return new ArrayList<T>(objects);
    }

    public void clear() {
        objects.clear();
    }

    public float getWeight() {
        if (objects.size() == 0) return 0;
        float weight = 0;
        for (T object : objects) weight += object.getWeight();
        return weight;
    }

    public boolean compare(BoxWithFruit boxWithFruit) {
        return this.getWeight() == boxWithFruit.getWeight();
    }

    public void transfer(BoxWithFruit<? super T> box) {
        box.objects.addAll(this.objects);
        clear();
    }
    }






