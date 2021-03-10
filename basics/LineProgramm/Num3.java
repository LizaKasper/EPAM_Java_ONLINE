package by.learnepam.basics.LineProgramm;

import java.util.Scanner;

public class Num3 {

    public static void main(String args [] ){
        System.out.println("  3. Вычислить значение выражения по формуле (все переменные принимают действительные значения)\n" +
                "     * z = ((sin x + cos y) / (cos x - sin y)) * tg xy");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = in.nextDouble();
        double radians1 = Math.toRadians(x);
        System.out.println("Введите y: ");
        double y = in.nextDouble();
        double radians2 = Math.toRadians(y);
        double xy = x * y;
        double radians3 = Math.toRadians(xy);
        double answer = ( (( Math.sin(radians1)+ Math.cos(radians2) ) / (Math.cos(radians1)+ Math.sin(radians2) ) ) * Math.sin(radians1)+ Math.tan(radians3) );
        System.out.println("Значение выражения: " + answer);
          }
}
