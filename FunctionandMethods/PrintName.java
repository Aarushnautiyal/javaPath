package FunctionandMethods;

import java.util.Scanner;

public class PrintName {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        printMyName(name);
    }
}
