package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int angle_1, angle_2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение первого угола: ");
        angle_1 = scan.nextInt();
        System.out.println("Введите значение второго угола: ");
        angle_2 = scan.nextInt();
        if (angle_1 + angle_2 >= 180)
            System.out.println("Такой треугольник не существует");
            else if (angle_1 + angle_2 == 90)
            System.out.println("Треугольник прямоугольный");
            else System.out.println("Треугольник не прямоугольный");
    }
}
