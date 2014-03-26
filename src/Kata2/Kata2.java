package Kata2;

import Kata2.HistogramBuilder.AttributeExtractor;

public class Kata2 {

    public static void main(String[] args) {
        showNamesHistogram();
        showIntegerHistogram();
        showMailHistogram();
    }

    private static void showNamesHistogram() {
        String[] array = {"Pepe", "Luis", "José", "Arturo", "María", "Pepe", "María", "Pepepaco"};
        HistogramBuilder<String> builder = new HistogramBuilder<>(array);
        Histogram<String> histogram = builder.build();
        System.out.println("\nHistogram for Strings:");
        for (String word : histogram.getEntries()) {
            System.out.println(word + ":" + histogram.getCount(word));
        }
    }

    private static void showIntegerHistogram() {
        Integer[] array = {1, 4, 3, 2, 1, 2, 4, 1, 2, 1, 8, 1};
        HistogramBuilder<Integer> builder = new HistogramBuilder<>(array);
        Histogram<Integer> histogram = builder.build();
        System.out.println("Histogram for Integers:");
        for (Integer value : histogram.getEntries()) {
            System.out.println(value + ":" + histogram.getCount(value));
        }
    }

    private static void showMailHistogram() {
        Mail[] mails = {
            new Mail("canary@gmail.com"),
            new Mail("joshua@alumno.ulpgc.es"),
            new Mail("pedro@gmail.com"),
            new Mail("caballero@dis.ulpgc.es"),
            new Mail("billgates@hotmail.com"),
            new Mail("vito@mafia.it"),
            new Mail("santino@mafia.it"),
            new Mail("jugon@gamer.com")
        };
        HistogramBuilder<Mail> builder = new HistogramBuilder<>(mails);
        Histogram<String> histogram = builder.build(domainExtractor());
        System.out.println("\nHistogram for E-mails");
        for (String domain : histogram.getEntries()) {
            System.out.println(domain + ":" + histogram.getCount(domain));
        }
    }

    private static AttributeExtractor domainExtractor() {
        return new HistogramBuilder.AttributeExtractor<Mail, String>() {
            @Override
            public String extract(Mail value) {
                return value.getDomain();
            }
        };
    }
}