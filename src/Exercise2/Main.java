package Exercise2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // I’m using a HashSet to store book titles, and I know it won’t allow duplicates
        HashSet<String> bookTitles = new HashSet<>();
        // Adding some book titles, including a duplicate
        bookTitles.add("Harry Potter");
        bookTitles.add("1984");
        bookTitles.add("The Great Gatsby");
        bookTitles.add("1+1");
        bookTitles.add("Harry Potter");
        // Printing all unique titles (duplicates are removed automatically)
        System.out.println("Unique book titles: ");
        for (String title : bookTitles) {
            System.out.println(title);
        }



    }
}
