package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
	    int T = scan.nextInt();
	    int hours = T/10000;
	    int min = (T % 10000)/100;
	    int sec = (T % 100);
        System.out.println(hours + "ч " + min + "мин " + sec + "с");
    }
}
