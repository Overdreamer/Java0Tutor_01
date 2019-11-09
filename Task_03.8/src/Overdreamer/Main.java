package Overdreamer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a, b, x;
	boolean zero = false;
	int [] arr = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = scan.nextInt();
        System.out.println("Введите второе число: ");
        b = scan.nextInt();
        // Поиск одинаковых цифр
        do {
            x = a%10;
            // Проверка налия уже имеющихся повторов
            while (x == arr[x]){
                if (zero == false)
                    break;
                a /=10;
                x = a%10;
            }
            // Поиск цифры из первого числа во втором числе
            for (int i = b; i != 0;) {
                if (x == 0) {
                    zero = true;
                    break;
                }
                if (x == i % 10) {
                    arr[x] = x;
                    break;
                } else i /= 10;
            }

            a /=10;
        } while (a != 0);
        //Ввод результата работы програмы
        int count = 0;
        System.out.print("Повторяющиеся цифры: ");
        if (zero == true)
            System.out.print("0");
        for (int i = 1; i < arr.length; i++){
            if (arr[i] != 0) {
                count++;
                System.out.print(arr[i] + " ");
            }
        }
        if (zero == false && count == 0)
            System.out.println("отсутствуют");

    }
}
