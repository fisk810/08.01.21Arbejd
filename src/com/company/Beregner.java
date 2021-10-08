package com.company;

public class Beregner {


    int arraySum(int[] x){
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];

        }
        return sum;
    }
}
