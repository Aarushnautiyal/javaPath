package conditionalStatements;

import java.util.*;

public class AdultOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("WEllcome to the ");
        System.out.println("Welcome to the club \n What is your age user ?");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Welcome to the club matey");
        } else {
            System.out.println("Kids are not allowed");
        }
    }
}
