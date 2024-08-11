package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10,11);

        }
        System.out.println(Arrays.toString(arr));

        //Написать метод, возвращающий количество чётных элементов массива.
        Is_Even even = new Is_Even();
        System.out.println("Количество четных элементов в массиве: " + even.evenCount(arr));

        //Написать функцию, возвращающую разницу между самым большим
        // и самым маеньким элементами переданного не пустого массива.

        DifferenceMinMaxElemOfArray diff = new DifferenceMinMaxElemOfArray();
        System.out.println("Разница между самым больши и самым маленьким эдементами массива: " + diff.difference(arr));

        //Написать функцию, возвращающую истину,
        // если в переданном массиве есть два соседних элемента, с нулевым значением.

        NullNeibhors nall = new NullNeibhors();
        System.out.println(nall.zero(arr));




    }












}