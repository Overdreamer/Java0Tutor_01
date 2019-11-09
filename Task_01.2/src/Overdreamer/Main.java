package Overdreamer;

import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {
            double a, b, c, z;
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите значение a: ");
            a = scan.nextDouble();
            System.out.print("Введите значение b: ");
            b = scan.nextDouble();
            System.out.print("Введите значение c: ");
            c = scan.nextDouble();
            z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a, 3) + Math.pow(b, 2);
            System.out.println("Значение выражения: " + String.format("%.2f",z));
        }
}
