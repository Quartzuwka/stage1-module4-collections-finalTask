package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        ArrayList<String> resultArray = new ArrayList<>();
        ArrayList<String> strArr = new ArrayList<>(projects.keySet());


        for (String str : strArr) {
            Set<String> setOf = projects.get(str);
                for (String strX : setOf) {
                    if (strX.equals(developer)) {
                        resultArray.add(str);
                    }
            }
        }


        return resultArray;
    }
}
