package patterns_part2;

public class Parellelogram {
    public static void main(String[] args) {
        int n = 5;
        int spaces = n;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
