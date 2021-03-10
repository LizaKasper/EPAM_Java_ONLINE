package by.learnepam.basics.Branching;

import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
        System.out.println("5.  Вычислить значение функции:\n" +
                " F(x) = x2 = x²-3x+9, если x<=3\n" +
                " F(x) = 1/(x³ + 6), если x>3" ) ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение Х: ");
        double x = in.nextInt();
        double Fx;
        if ( x <= 3 ) {
            Fx =  (Math.pow ( x, 2 ) - 3 * x + 9);

            System.out.println("Fx = " + Fx);
        } else
        {
            Fx = 1 / ( Math.pow ( x , 3 ) + 6 );
            System.out.println("Fx = " + Fx);
        }

    }
}
