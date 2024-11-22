package Exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // I’ll create a list to store random numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        // Filling the list with 10 random numbers between 0 and 99
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100));
        }
        System.out.println("Original list: " + numbers);
        // Sorting the list in descending order
        numbers.sort(Collections.reverseOrder());
        System.out.println("List after sorting in descending order: " + numbers);

        // Shuffling the list randomly
        Collections.sort(numbers);
        System.out.println("List after snuffling: " + numbers);
    }
}
