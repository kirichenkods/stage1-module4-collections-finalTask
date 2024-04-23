package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> mapKeys = new HashMap<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            String keySource = e.getKey();
            int key = keySource.length();
            Set<String> setKeys = mapKeys.getOrDefault(key, new HashSet<>());
            setKeys.add(keySource);
            mapKeys.put(key, setKeys);
        }

        return mapKeys;
    }
}
