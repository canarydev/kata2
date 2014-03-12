package Kata2;
public class HistogramBuilder {
    
    public static Histogram build(String[] values) {
        Histogram histogram = new Histogram();
        for (String value : values) 
            histogram.incrementCountFor(value);
        return histogram;
    }
    
}