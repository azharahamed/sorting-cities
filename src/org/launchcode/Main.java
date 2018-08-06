package org.launchcode;

import org.launchcode.comparators.AreaComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator comparator = new NameComparator();
        cities.sort(comparator);
        printCities(cities);

        System.out.println("\nArea Comparator");
        AreaComparator comparatorArea = new AreaComparator();
        cities.sort(comparatorArea);
        printCities(cities);

        System.out.println("\nPopulation Comparator");
        PopulationComparator populationComparator = new PopulationComparator();
        cities.sort(populationComparator);
        printCities(cities);

        System.out.println("\nState Comparator");
        StateComparator stateComparator = new StateComparator();
        cities.sort(stateComparator);
        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
