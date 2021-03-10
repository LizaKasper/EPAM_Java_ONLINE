package by.learnepam.basics.LineProgramm;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        System.out.println(" 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения)\n" +
                "  z=(b+√(b²+4ac))/2a - a³с + b⁻ ² ");
        Scanner in = new Scanner(System.in);
    System.out.println("Введите a: ");
    double a = in.nextDouble();
    System.out.println("Введите b: ");
    double b = in.nextDouble();
    System.out.println("Введите c: ");
    double c = in.nextDouble();
    double answer = ( ( (b + Math.sqrt( Math.pow(b, 2) + 4 * a * c ) ) / (2*a) ) - (Math.pow(a, 3) * c) + Math.pow(b, -2));
    System.out.println("Значение выражения: " + answer);

}


}
