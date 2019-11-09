package Overdreamer;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger sum  = new BigInteger("1");
        for (int i = 2; i <= 200; i++){
	    sum = sum.multiply(BigInteger.valueOf(i*i));
    }
        System.out.println(sum);
    }
}
