package Exercise3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // I’m creating a map where student names are keys, and their grades are values
        HashMap<String, Integer> studentGrades = new HashMap<>();
        // Adding some students and their grades
        studentGrades.put("Alice", 91);
        studentGrades.put("Ben", 95);
        studentGrades.put("Charlie", 80);
        studentGrades.put("Denis", 75);
        studentGrades.put("Elena", 60);
        studentGrades.put("Fred", 40);
        // Now I’ll find and display the students who scored above 90
        System.out.println("Students scored above 90:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            if (entry.getValue() > 90) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
