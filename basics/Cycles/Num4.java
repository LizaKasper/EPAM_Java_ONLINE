package by.learnepam.basics.Cycles;

public class Num4 {
    public static void main(String[] args) {
        System.out.println("4. Найти сумму квадратов первых ста чисел.");
        int x=200;
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact = fact * (i*i);
        }
        System.out.println(fact);
    }
}
