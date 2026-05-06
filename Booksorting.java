import java.util.Arrays;

public class Booksorting {
    public static void main(String[] args) {

        int[] bookIDs = {45, 12, 78, 34, 23};

        // Sort array
        Arrays.sort(bookIDs);

        // Display sorted list
        System.out.println("Sorted Book IDs:");
        for (int id : bookIDs) {
            System.out.println(id);
        }
    }
}