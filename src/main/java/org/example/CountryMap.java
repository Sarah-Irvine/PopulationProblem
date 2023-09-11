package org.example;

import java.util.HashMap;
import java.util.TreeSet;

public class CountryMap {
    private HashMap<String, Country> countries = new HashMap<>();
    public TreeSet<Country> countryPopulations = new TreeSet<>(countries.values());

    public CountryMap() {
        populate();
    }

    private void populate() {

        countries.put("uk", new Country("uk", 500));
        countries.put("US", new Country("US", 5000));
        countries.put("GER", new Country("GER", 670));
        countries.put("GB", new Country("GB", 5034));

        System.out.println(countries.values());
        System.out.println(countryPopulations.size());
    }

    public void removeCountry(String removeCountryName) {
        if (countries.containsKey(removeCountryName)) {
            countries.remove(removeCountryName);
            System.out.println(removeCountryName + " successfully removed from the HashMap");
        } else {
            System.out.println("No country found");
        }
    }
}





