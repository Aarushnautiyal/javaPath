package Execercises;
// Two numbers are entered by the user,x and n.Write a function to find the value of one number raised to the power of another i.e.xn.

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        int first = sc.nextInt();
        System.out.println("Enter power");
        int Second = sc.nextInt();
        sc.close();
        System.out.println(Math.pow(first, Second));
    }
}
