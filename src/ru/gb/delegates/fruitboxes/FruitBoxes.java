package ru.gb.delegates.fruitboxes;

public class FruitBoxes {
    public static void main(String[] args) {
        Box<Apple> appleBoxSrc = new Box<>();

        appleBoxSrc.addFruit(new Apple());
        appleBoxSrc.addFruit(new Apple());
        appleBoxSrc.addFruit(new Apple());
        appleBoxSrc.addFruit(new Apple());
        appleBoxSrc.addFruit(new Apple());
        Box<Apple> appleBoxDst = new Box<>();
        System.out.println("Source Box weight before pour - " + appleBoxSrc.getWeight());
        System.out.println("Destination Box weight before pour - " + appleBoxDst.getWeight());
        appleBoxSrc.pour(appleBoxDst);
        System.out.println("Source Box weight after pour - " + appleBoxSrc.getWeight());
        System.out.println("Destination Box weight after pour - " + appleBoxDst.getWeight());
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println(appleBoxSrc.compare(orangeBox));
    }
}
