package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m, n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите начало промежутка m: ");
        m = scan.nextInt();
        System.out.println("Введите конец промежутка n: ");
        n = scan.nextInt();
        for (int i = m; i <= n; i++){
            int count = 0;
            System.out.print("Делители числа " + i + ": ");
            for (int x = 2; x < i; x++){
                if (i % x == 0) {
                    count++;
                    System.out.print(x + " ");
                }
            }
            if (count == 0)
                System.out.print("Нет делителей");
            System.out.println("\n");
        }
    }
}
