package Execercises;

import java.util.Scanner;

// Enter 3 numbers from the user & make a function to print their average.
public class Average {
    public static int findingTheAvg(int a, int b, int c) {
        return ((a + b + c) / 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Value:-");
        int firstValue = sc.nextInt();
        System.out.println("Enter the Second Value:-");
        int SecondValue = sc.nextInt();
        System.out.println("Enter the Third Value:-");
        int ThirdValue = sc.nextInt();
        sc.close();
        System.out.println(findingTheAvg(firstValue, SecondValue, ThirdValue));
    }
}
