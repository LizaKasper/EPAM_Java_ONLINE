package by.learnepam.basics.Cycles;

import java.util.Scanner;

public class Num8 {
    public static void main(String[] args) {
        System.out.println("Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение первого числа: ");
        int a = in.nextInt();
        System.out.print("Введите значение второго числа: ");
        int b = in.nextInt();
        int currentA = a;
        System.out.println("ЦИфры первого числа");
        while (currentA != 0) {
            int result1 = currentA % 10;
            System.out.println(result1);
            currentA = currentA / 10;
        }
        int currentB = b;
        System.out.println("Цифры второго числа");
        while (currentB != 0) {
           int result2 = currentB % 10;
            System.out.println(result2);
            currentB /= 10;
        }
    }
}
