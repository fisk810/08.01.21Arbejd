package com.company;

public class Main {

    public static void main(String[] args) {
        int[] xArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Beregner beregner = new Beregner();
        System.out.println(beregner.arraySum(xArr));
    }
}
