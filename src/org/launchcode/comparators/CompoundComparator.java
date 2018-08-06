package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompoundComparator implements Comparator<City> {

    List<Comparator<City>> comparators = new ArrayList<>();

    @Override
    public int compare(City o1, City o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public void add(Comparator<City> c){
        this.comparators.add(c);
    }
}
