package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        ArrayList<String> arrayList = new ArrayList<>(sourceMap.keySet());

        Map<Integer, Set<String>> map = new HashMap<>();




        while (!arrayList.isEmpty()) {
            Set<String> setOf = new HashSet<>();
            int number = arrayList.get(0).length();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()){
                String str = it.next();
                if (str.length()==number) {
                    setOf.add(str);
                    it.remove();
                }
            }
            map.put(number,setOf);

        }

        return map;

    }
}
