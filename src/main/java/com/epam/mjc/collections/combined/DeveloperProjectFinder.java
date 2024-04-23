package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developerProjects = new ArrayList<>();
        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) {
                developerProjects.add(e.getKey());
            }
        }
        ListComparator listComparator = new ListComparator();
        developerProjects.sort(listComparator);

        return developerProjects;
    }
}

class ListComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() == s2.length()) {
            return -(s1.compareTo(s2));
        }
        return s2.length() - s1.length();
    }
}
