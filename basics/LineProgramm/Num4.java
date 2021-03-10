package by.learnepam.basics.LineProgramm;

import java.util.Scanner;

public class Num4 {

    public static void main(String args []) {
        System.out.println("  4.  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).\n" +
                " Поменять местами дробную и целую части числа и вывести полученное значение числа. ");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение R вида nnn.ddd: ");
        double R = in.nextDouble();
        double R1 = (R * 1000) % 1000 + (int) R / 1000.0;
        if (R>=1000) {
            System.out.println("Ошибка: слишком большое число.");
            System.exit(1);
        }
        System.out.println(R1);
    }
}