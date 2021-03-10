package by.learnepam.basics.Cycles;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        System.out.println("2. Вычислить значения функции на отрезке [а,b] c шагом h");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение отрезка [a, b]: ");
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.println("Введите значение шага H: ");
        System.out.print("h = ");
        int h = in.nextInt();
        int y;
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }
        if ( a > b ) {
            System.out.println("ошибка");
        }
            }
}