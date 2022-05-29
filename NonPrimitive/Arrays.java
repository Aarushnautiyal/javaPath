package NonPrimitive;

public class Arrays {
    public static void main(String[] args) {
        // int array[] = { 2, 3, 4, 5 }; one way to define array for known values;
        int array[] = new int[3]; // Second way of doing it when u don't know the values but know the actual size
        array[0] = 2;
        array[1] = 3;
        array[2] = 4;
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
