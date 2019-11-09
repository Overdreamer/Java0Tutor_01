package Overdreamer;

import java.math.*;

public class Main {

    public static void main(String[] args) {
        int a, b, c, d, minAB, minCD;
        a = (int) (Math.random() * 100);
        b = (int) (Math.random() * 100);
        c = (int) (Math.random() * 100);
        d = (int) (Math.random() * 100);
        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        if (a < b)
            minAB = a;
        else minAB= b;
        if (c < d)
            minCD = c;
        else minCD = d;
        if (minAB > minCD)
            System.out.println(minAB);
        else System.out.println(minCD);


    }
}
