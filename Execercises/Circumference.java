package Execercises;
// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class Circumference {
    public static Double circumference(int radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a cicle");
        int radius = sc.nextInt();
        sc.close();
        System.out.println(circumference(radius));
    }
}
