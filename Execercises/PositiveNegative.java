package Execercises;

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        Scanner sc = new Scanner(System.in);
        int negative = 0;
        int positive = 0;
        do {
            System.out.println("Enter a number or enter 0 if you wish to discontinue");
            int key = sc.nextInt();
            if (key == 0) {
                break;
            }
            if (key > 0) {
                positive += 1;
            } else {
                negative += 1;
            }
            i++;
            j++;
        } while (i != j);
        sc.close();
        System.out.println("Positive Numbers are " + positive + " \n Negativve Numbers are " + negative);
    }
}
