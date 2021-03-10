package by.learnepam.basics.LineProgramm;

import java.util.Scanner;

public class Num5 {

        public static void main(String args []) {
            System.out.println("  5.   Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. " +
                    "Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите значение T в минутах: ");
            int T = in.nextInt();
            int S = 0; int M = 0; int H = 0;
            H = T / 3600;
            M = ( T - H * 3600) / 60;
            S = T - H * 3600 - M * 60 ;

            System.out.println( H + "чч" + M + "мм" +S + "cc");
        }
    }
