package Overdreamer;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int x;
	    double F;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        x = scan.nextInt();
        if (x <= 3)
            F = x*x-3*x+9;
        else F = 1/(double)(x*x*x+6);
        System.out.println(String.format("%.3f",F));
    }
}
