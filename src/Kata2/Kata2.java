package Kata2;


public class Kata2 {

    public static void main(String[] args) {
        String[] array = {"Pepe","Luis","Jose","Arturo","María","Pepe","María"};
        Histogram histogram = HistogramBuilder.build(array);
        for (String value : histogram.getEntries()) {
            System.out.println(value + ":" + histogram.getCount(value));
        }
    }
}