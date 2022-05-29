package Execercises;

// Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;

public class SumOfOdd {
    public static int isOdd(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("outer" + i);
            if ((i % 2) != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.close();
        System.out.println(isOdd(num));
        // isOdd(num);
    }
}
