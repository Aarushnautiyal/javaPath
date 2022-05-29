package NonPrimitive;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Define the size of an array");
        int size = sc.nextInt();
        int array[] = new int[size];
        // Taking inputs for the array that we initialized
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the value for " + i + " index");
            array[i] = sc.nextInt();
        }
        // initiating the linear Search
        System.out.println("Enter the value you want to search");
        int value = sc.nextInt();
        sc.close();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("Desired value is in " + i + " index");
                break;
            }
        }
    }
}
