package by.learnepam.basics.Cycles;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        System.out.println("1. Напишите программу, где пользователь вводит любое целое положительное число. " +
                "А программа суммирует все числа от 1 до введенного пользователем числа.");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение Х: ");
        int x = in.nextInt();
        int sum = 0;
        while (x >= 1) {
            sum = sum + x;
            x--;
        }
        System.out.println(sum);
    }
}
