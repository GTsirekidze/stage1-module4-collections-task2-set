package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> ans = new HashSet<>();

        for (String firstValue: firstSet) {
            boolean isInSecondSet = secondSet.stream().anyMatch(x -> x.equals(firstValue));
            boolean isInThirdSet = thirdSet.stream().anyMatch(x -> x.equals(firstValue));
            if(!isInThirdSet && isInSecondSet) {
                ans.add(firstValue);
            }
        }

        for (String thirdValue: thirdSet) {
            boolean isInSecondSet = secondSet.stream().anyMatch(x -> x.equals(thirdValue));
            boolean isInFirstSet = firstSet.stream().anyMatch(x -> x.equals(thirdValue));

            if(!isInFirstSet && !isInSecondSet){
                ans.add(thirdValue);
            }
        }

        return ans;
    }
}
