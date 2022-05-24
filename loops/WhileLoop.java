package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number to find out the sum of natural number till the num");
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        while (i < num) {
            sum += i;
            i++;
        }
        System.out.println("Sum of n natural numbers are " + sum);

    }
}
