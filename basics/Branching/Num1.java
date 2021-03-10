package by.learnepam.basics.Branching;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        System.out.println("1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, " +
                "и если да, то будет ли он прямоугольным." ) ;
    Scanner in = new Scanner(System.in);
    System.out.println("Введите угол 1: ");
    int U1 = in.nextInt();
    System.out.println("введите угол 2: ");
    int U2 = in.nextInt();
        int sum = U1 + U2;
        if ( sum  >= 180 ) {
        System.out.println(" Такой тругольник  не существует. ");
    } else  {
       System.out.println(" Такой треугольник  существует ");
            if ( U1 == 90 || U2 == 90 ) {
                System.out.println(" Этот треугольник - прямоугольный ");
        }
    }
}
}
