package by.learnepam.basics.LineProgramm;

import java.util.Scanner;

public class Num1 {
            public static void main(String[] args) {
                System.out.println(" 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c ");
                Scanner sin = new Scanner(System.in);

                System.out.print("a=");
                float a = sin.nextFloat();
                System.out.print("b=");
                float b = sin.nextFloat();
                System.out.print("c=");
                float c = sin.nextFloat();

                float z=((a-3)*b/2)+c;
                System.out.println("a=" + a + " b=" + b + " c=" + c + " z=" + z);
        }
    }

