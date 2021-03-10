package by.learnepam.basics.Branching;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        System.out.println("3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой." ) ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение для точка A: ");
        System.out.print("x1 = ");
        int x1 = in.nextInt();
        System.out.print("y1 = ");
        int y1 = in.nextInt();
        System.out.println("Введите значение для точка B: ");
        System.out.print("x2 = ");
        int x2 = in.nextInt();
        System.out.print("y2 = ");
        int y2 = in.nextInt();
        System.out.println("Введите значение для точка C: ");
        System.out.print("x3 = ");
        int x3 = in.nextInt();
        System.out.print("y3 = ");
        int y3 = in.nextInt();
        if (((x1 - x3) * (y2 - y3)) == ((x2 - x3) * (y1 - y3))) {
            System.out.println("Точки расположены на одной прямой");
        } else  {
            System.out.println(" Точки не расположены на одной прямой ");

        }
    }
}
