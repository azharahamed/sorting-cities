package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompoundComparator implements Comparator<City> {

    List<Comparator<City>> comparators = new ArrayList<>();

    @Override
    public int compare(City o1, City o2) {
        int i = 0;
        Comparator<City> a = comparators.get(i);
        int result = 0;

        while(i < comparators.size()){
            result = a.compare(o1,o2);
            if(result == 0) a = comparators.get(++i);
            else return result;
        }
        return result;
    }

    public void add(Comparator<City> c){
        this.comparators.add(c);
    }
}
