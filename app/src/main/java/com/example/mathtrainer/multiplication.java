package com.example.mathtrainer;

public class multiplication {
    private int result;

    public int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public int getResult() {
        return result;
    }
    public int getWrongResult() {
        return result * getRandom(1, 20);
    }

    public String getProblem(){
        int a = getRandom(-10, 10);
        int b = getRandom(0, 23);
        result = a*b;
        return String.valueOf(a+"*"+b);
    }


}
