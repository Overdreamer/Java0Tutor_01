package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, sum = 0, counter = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        x = scan.nextInt();
        while (counter < x){
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
}
