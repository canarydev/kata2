package Kata2;

import java.util.HashMap;
import java.util.AbstractMap;
import java.util.Set;

public class Histogram {
    
    private AbstractMap<String, Integer> map;

    public Histogram() {
        this.map = new HashMap<>();
    }
    
    public void incrementCountFor(String entry) {
        map.put(entry, getCount(entry) + 1);
    }
    
    public Set<String> getEntries() {
        return map.keySet();
    }
    
    public int getCount(String entry) {
        Integer count = map.get(entry);
        if (count == null) return 0;
        return count;
    }
    
}