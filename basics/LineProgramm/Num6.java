package by.learnepam.basics.LineProgramm;

import java.util.Scanner;

public class Num6 {
    public static void main(String[] args) {
        System.out.println("  6.  Для данной области составить линейную программу, которая печатает true, если точка с координатами\n" +
                "(х, у) принадлежит закрашенной области, и false — в противном случае:");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты точки  х: ");
        int x = in.nextInt();
        System.out.println("Введите координаты точки  y: ");
        int y = in.nextInt();
        if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            System.out.println(" true ");
        } else if (x >= -2 && x <= 2 && y >= -3 && y <= 4) {
            System.out.println(" true ");
        } else {
            System.out.println(" false ");
        }
    }
}
