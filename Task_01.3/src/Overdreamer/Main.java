package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, y, z;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        x = scan.nextDouble();
        System.out.print("Введите значение b: ");
        y = scan.nextDouble();
        z = (Math.sin(x)+Math.cos(y))/(Math.cos(x)+Math.sin(y))*Math.tan(x*y);
        System.out.println("Значение выражения: " + String.format("%.2f",z));
    }
}
