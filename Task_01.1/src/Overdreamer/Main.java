package Overdreamer;

import java.util.Scanner;

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
        z = ((a - 3) * b / 2) + c;
        System.out.println("Значение выражения: " + z);
    }
}
