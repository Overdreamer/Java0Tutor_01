package Overdreamer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int [] arrX = new int [3];
	int [] arrY = new int [3];
	double [] k = new double[3];
	boolean Line = true;
	for (int i = 0; i < 3; i++){
        System.out.print("Введите координаты точки " + (char)(i+65) + ":\nX" + (i+1) + "=");
        arrX[i] = scan.nextInt();
        System.out.print("Y" + (i+1) + "=");
        arrY[i] = scan.nextInt();
        k[i] = arrY[i]/arrX[i];
    }
        for (int i = 0; i < k.length-1; i++) {
            if (k[i] != k[i+1]) {
                Line = false;
                break;
            }
        }
        if (Line){
            System.out.println("Заданные точки лежат на одной прямой");}
	    else {System.out.println("Заданные точки лежат не на одной прямой");}
    }
}
