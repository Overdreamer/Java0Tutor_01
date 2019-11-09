package Overdreamer;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        double x, y, z, a;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        x = scan.nextDouble();
        y = ((int) x) / 1000d;
        a = x*1000 % 1000;
        z = a + y;
        System.out.println(String.format("%.3f", z));
    }
}
