package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet <Integer> ans = new HashSet<>();

        for (Integer value:sourceList) {
            if(value %2==1){
                ans.add(value);
                ans.add(value*2);
                continue;
            }
            while(value%2==0 && value!=0){
                ans.add(value);
                value/=2;
            }
            ans.add(value);
        }
        return ans;
    }
}
