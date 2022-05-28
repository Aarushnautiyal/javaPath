package Execercises;

// Write a function that takes in age as input and returns if that person is eligible to vote or not.A person of age>18 is eligible to vote.
import java.util.Scanner;

public class EligibleForVote {
    public static Boolean isEligible(int age) {
        return age >= 18 ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        sc.close();
        if (isEligible(age)) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
