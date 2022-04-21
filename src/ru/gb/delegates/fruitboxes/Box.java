package ru.gb.delegates.fruitboxes;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public float getWeight() {
        float sum=0;
        for (T fruit : fruits) {
            sum+= fruit.getWeight();
        }

        return sum;
    }

    public <V extends Fruit> boolean compare(Box<V> box) {
        if (Math.abs(getWeight()- box.getWeight()) < 0.0001)
            return true;
            else
                return false;
    }

    public void pour(Box<T> box) {

        for (T fruit : fruits) {
            box.addFruit(fruit);
        }
        fruits.clear();
    }
}
