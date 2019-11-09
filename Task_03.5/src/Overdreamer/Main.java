package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        double sum = 0, e;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество элементов ряда: ");
        n = scan.nextInt();
        System.out.println("Введите контрольное значение e: ");
        e = scan.nextDouble();
        for (int i = 1; i <= n; i++){
            double x = 1/Math.pow(2,i) + 1/Math.pow(3,i);
            System.out.println(x);
            if (x >= e){
                sum += x;
            }
        }
        System.out.println(String.format("%.2f", sum));
    }
}
