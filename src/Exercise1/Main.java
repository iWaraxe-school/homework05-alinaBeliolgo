package Exercise1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // I'm creating a list to hold 10 random numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random rand = new Random();
        // Now I'll fill the list with 10 random numbers between 0 and 99
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100));
        }
        System.out.println("Number of numbers: ");
        // I want to print only the numbers at even indices
        for (int i = 0; i < numbers.size(); i+=2) {
            System.out.println( numbers.get(i) + " " + numbers.get(i+1));
        }
    }
}