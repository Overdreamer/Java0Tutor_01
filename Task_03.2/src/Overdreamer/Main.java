package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, h, a, b, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите интервал a, b");
        System.out.print("a:");
        a = scan.nextInt();
        System.out.print("b:");
        b = scan.nextInt();
        System.out.print("Введите шаг:");
        h = scan.nextInt();
        for (;a <= b; a+=h){
            if (a > 2)
                System.out.print(a + " ");
            else System.out.println(a * -1 + " ");
        }
    }
}
