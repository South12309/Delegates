package ru.gb.delegates;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork_1_and_2 {

    public static void main(String[] args) {

    }

    public <T> void changeElementArray(T[] array, int i1, int i2) {
        T temp;
        temp = array[i1];
        array[i1]=array[i2];
        array[i2]=temp;
    }

    public <T> ArrayList<T> arrayToArrayList(T[] array) {
        ArrayList<T> arrayList =new ArrayList<>(Arrays.asList(array));
        return arrayList;
    }
}
