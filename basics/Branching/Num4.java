package by.learnepam.basics.Branching;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        System.out.println("4.Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. " +
                "Определить, пройдет ли кирпич через отверстие." ) ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размеры кирпича: ");
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        System.out.print("z = ");
        int z = in.nextInt();
        System.out.println("Введите размеры отверстия: " );
        System.out.print("A = ");
        int A = in.nextInt();
        System.out.print("B = ");
        int B = in.nextInt();
        if  ( (A >= x) && (B >= y ) ||
                ( A >= y ) &&  ( B >= x ) ||
                ( A>= x ) && ( B >= z )  ||
                ( A >= z ) &&  ( B >= x ) ||
                ( A >= z ) &&  ( B >= y )  ||
                ( A >= y ) && ( B >= z ) ) {
            System.out.println("Влезет " );
        } else {
            System.out.println("Не влезет " );
        }

    }
}

