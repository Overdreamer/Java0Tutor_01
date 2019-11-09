package Overdreamer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int A, B, x, y, z;
        System.out.print("Введите размер отверстия A: ");
        A = scan.nextInt();
        System.out.print("Введите размер отверстия B: ");
        B = scan.nextInt();
        System.out.println("Введите размер кирпича x:");
        x = scan.nextInt();
        System.out.println("Введите размер кирпича y:");
        y = scan.nextInt();
        System.out.println("Введите размер кирпича z:");
        z = scan.nextInt();
        if (A >= x) {
            if (B >= y || B >= z)
                System.out.println("Кирпич проходит через отверстие");
                else System.out.println("Кирпич не проходит через отверстие");
        } else if (B >= y && B >= z)
                System.out.println("Кирпич проходит через отверстие");
                else
                System.out.println("Кирпич не проходит через отверстие");
        }
}
