package ru.gb.delegates.fruitboxes;

public abstract class Fruit {

    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
