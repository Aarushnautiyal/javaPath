package Execercises;

import java.util.Scanner;

// Write a function which takes in 2 numbers and returns the greater of those two.
public class Greater {
    public static int whichIsGreater(int first, int Second) {
        return first > Second ? first : Second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = sc.nextInt();
        System.out.println("Enter Second Number");
        int Second = sc.nextInt();
        sc.close();
        System.out.println("The Greater number is :- " + whichIsGreater(first, Second));
    }
}
