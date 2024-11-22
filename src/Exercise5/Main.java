package Exercise5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // I’m creating a map where the key is a country name,
        // and the value is another map with details like capital and population
        HashMap<String, HashMap<String, Object>> countryData = new HashMap<>();
        // Adding details for the USA
        HashMap<String, Object> usaDetails = new HashMap<>();
        usaDetails.put("Capital", "Washington D.C."); // USA's capital
        usaDetails.put("Population", 331_000_000);   // USA's population

        // Adding details for Canada
        HashMap<String, Object> canadaDetails = new HashMap<>();
        canadaDetails.put("Capital", "Ottawa");      // Canada's capital
        canadaDetails.put("Population", 38_000_000); // Canada's population

        // Adding details for Germany
        HashMap<String, Object> germanyDetails = new HashMap<>();
        germanyDetails.put("Capital", "Berlin");     // Germany's capital
        germanyDetails.put("Population", 83_000_000); // Germany's population

        // Adding all the countries to the main map
        countryData.put("USA", usaDetails);
        countryData.put("Canada", canadaDetails);
        countryData.put("Germany", germanyDetails);

        // Now, let’s display all the countries and their details
        for (String country : countryData.keySet()) {
            System.out.println("Country: " + country);
            HashMap<String, Object> details = countryData.get(country); // Getting the nested map
            System.out.println("  Capital: " + details.get("Capital")); // Showing the capital
            System.out.println("  Population: " + details.get("Population")); // Showing the population
        }




    }
}
