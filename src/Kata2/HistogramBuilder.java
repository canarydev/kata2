package Kata2;




public class HistogramBuilder {
    
    public static Histogram build(String[] values) {
        Histogram histogram = new Histogram();
        for (String value : values) {
            histogram.incrementCountFor(value);
        }
        return histogram;
    }
    
    public static Histogram build(Integer[] values) {
        Histogram histogram = new Histogram();
        for (Integer value : values) {
            histogram.incrementCountFor(value);
        }
        return histogram;
    }
    
    public static Histogram build(Mail[] values) {
        Histogram histogram = new Histogram(); 
        for (Mail value : values) {
            histogram.incrementCountFor(Mail.getDomain(value));
        }
        return histogram;
    }
}