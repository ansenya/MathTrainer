package com.example.mathtrainer;

public class div {
    private double result;

    public int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public double getResult() {
        return result;
    }
    public double getWrongResult() {
        return result / getRandom(1, 20);
    }

    public String getProblem(){
        int a = getRandom(-10, 100);
        int b = getRandom(1, 23);
        result = a/(double)b;
        return String.valueOf(a+"/"+b);
    }


}
