package Kata2;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Set;

public class Histogram<Type> {
    
    private AbstractMap<Type, Integer> map;

    public Histogram() {
        this.map = new HashMap<>();
    }
    
    public void incrementCountFor(Type entry) {
        map.put(entry, getCount(entry) + 1);
    }
    

    public Set<Type> getEntries() {
        return map.keySet();
    }
    
    public int getCount(Type entry) {
        Integer count = map.get(entry);
        if (count == null) {
            return 0;
        }
        return count;
    }
    
}