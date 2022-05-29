package Execercises;
// Write an infinite loop using do while condition.

public class InfiniteLoop {
    public static void main(String[] args) {
        int age = 1;
        int i = 0;
        do {
            System.out.println("Loop Ran");
            age++;
            i++;
        } while (age > i);
    }
}
