package Overdreamer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
	Scanner scan = new Scanner(System.in);
        System.out.print("Введите координату х: ");
        x = scan.nextInt();
        System.out.print("Введите координату y: ");
        y = scan.nextInt();
        if (x >= -2 && x <= 2 && y >= 0 && y <= 4)
            System.out.println("true");
            else if (x >= -4 && x <= 4 && y >= -3 && y <= 0){
            System.out.println("true");}
            else System.out.println("false");
    }
}
