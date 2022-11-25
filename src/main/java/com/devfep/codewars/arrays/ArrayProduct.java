package com.devfep.codewars.arrays;

public class ArrayProduct {
    public static int grow(int[] x) {
        int product = 1;
        for (int num : x) {
            product *= num;
        }
        return product;
    }
}

