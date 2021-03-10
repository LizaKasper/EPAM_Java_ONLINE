package by.learnepam.basics.Branching;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        System.out.println("2. Найти max{min(a, b), min(c, d)}." ) ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a, b, c, d: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int  min1 = 0, min2 = 0, max;
        if ( a > b ) {
            min1 = b;
        } else if ( a < b ) {
            min1 = a;
        }
        if ( c > d ) {
            min2 = d;
        } else if ( c < d ) {
            min2 = c;
        }
        int answer = Math.max (min1, min2);
        System.out.println ( answer) ;
    }
}
