package conditionalStatements;

import java.util.Scanner;

public class SwitchGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.close();
        switch (value) {
            case 1:
                System.out.println("case1");
                break;

            default:
                System.out.println("default case");
                break;
        }
    }
}
