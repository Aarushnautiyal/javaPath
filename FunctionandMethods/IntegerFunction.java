package FunctionandMethods;

import java.util.Scanner;

public class IntegerFunction {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Feed Number One:");
        int a = sc.nextInt();
        System.out.println("Feed Number Two:");
        int b = sc.nextInt();
        sc.close();
        System.out.println(Sum(a, b));

    }
}
