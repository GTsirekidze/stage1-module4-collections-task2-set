package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> ns = new TreeSet<>();

        for (Integer value:sourceList) {
            int poweredValue = value*value;
            if(poweredValue<=upperBound && poweredValue>=lowerBound)ns.add(value*value);
        }


        return ns;
    }
}
