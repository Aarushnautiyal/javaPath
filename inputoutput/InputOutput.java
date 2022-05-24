package inputoutput;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // For getting one input example: HEY we use sc.next()
        // String name = sc.next()
        // For getting more then one input expamle: HEY THERE we use nextLine()
        String name = sc.nextLine();
        sc.close();

        // Other scanner Functions are:-
        // nextInt()
        // nextFloat()
        System.out.println(name);
    }
}
