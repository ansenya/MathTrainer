package com.example.mathtrainer;

import android.view.View;

public class problem {
    private int result;

    public int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public int getResult() {
        return result;
    }
    public int getWrongResult() {
        return result + getRandom(1, 20);
    }

    public String getProblem(){
        int a = getRandom(-50, 50);
        int b = getRandom(0, 50);
        char sign = getRandomSign();
        if (sign == '+') result = a+b;
        else result = a-b;
        return String.valueOf(""+a + sign + b);
    }

    private char getRandomSign(){
        return getRandom(1, 3) == 1 ? '-':'+';
    }

}
