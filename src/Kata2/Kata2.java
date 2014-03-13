package Kata2;
public class Kata2 {

    public static void main(String[] args) {
        String[] array = {"Pepe","Luis","José","Arturo","María","Pepe","María","Pepepaco"};
        Integer[] vector = {1,4,3,2,1,2,4,1,2,1,8,1};
        Mail[] mailstring = {"canary@gmail.com","joshua@alumno.ulpgc.es",
            "pedro@gmail.com","caballero@dis.ulpgc.es","billgates@hotmail.com",
            "vito@mafia.it","santino@mafia.it","jugon@gamer.com"};
        Histogram<String> histogram = HistogramBuilder.build(array);
        Histogram<Integer> histogram2 = HistogramBuilder.build(vector);
        Histogram<Mail> histogram3 = HistogramBuilder.build(mailstring);
        System.out.println("Histogram for Strings:");
        for (String word : histogram.getEntries()) {
            System.out.println(word + ":" + histogram.getCount(word));
        }
        System.out.println("");
        System.out.println("Histogram for Integers:");
        for (Integer value : histogram2.getEntries()) {
            System.out.println(value + ":" + histogram2.getCount(value));
        }
        for (Mail mail : histogram.getEntries()) {       
        }
    }
}