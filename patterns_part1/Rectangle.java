package patterns_part1;

public class Rectangle {
    public static void main(String[] args) {
        // One Way
        // for (int i = 0; i < 4; i++) {
        // System.out.println("*****");
        // }

        // Second Way
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

// Ouput

// *****
// *****
// *****
// *****
