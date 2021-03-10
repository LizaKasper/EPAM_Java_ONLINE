package by.learnepam.basics.Cycles;

import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
        System.out.println("5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых " +
                "больше или равен заданному е.");
    double sum = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение e: ");
        double e = in.nextDouble();
        System.out.println("Введите значение n: ");
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            double an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(an) >= e ){
                sum += an;
            }
        }

        System.out.println("Сумма равна " + sum);
        }
}
