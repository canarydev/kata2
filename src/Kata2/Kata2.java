package Kata2;

import Mail.Mail;

public class Kata2 {

    public static void main(String[] args) {
        String[] array = {"Pepe","Luis","José","Arturo","María","Pepe","María","Pepepaco"};
        Integer[] vector = {1,4,3,2,1,2,4,1,2,1,8,1};
        String[] mailstring = {"canary@gmail.com","joshua@alumno.ulpgc.es",
            "pedro@gmail.com","caballero@dis.ulpgc.es","billgates@hotmail.com",
            "vito@mafia.it","santino@mafia.it","jugon@gamer.com"};
        Mail[] mail = new Mail[mailstring.length];
        for (int i = 0; i < mail.length; i++) {
            mail[i] = new Mail(mailstring[i]);   
        }
        Histogram<String> histogram = HistogramBuilder.build(array);
        Histogram<Integer> histogram2 = HistogramBuilder.build(vector);
        Histogram<String> histogram3 = HistogramBuilder.build(DomainString(mail));
        System.out.println("");
        System.out.println("Histogram for Strings:");
        for (String word : histogram.getEntries()) {
            System.out.println(word + ":" + histogram.getCount(word));
        }
        System.out.println("");
        System.out.println("Histogram for Integers:");
        for (Integer value : histogram2.getEntries()) {
            System.out.println(value + ":" + histogram2.getCount(value));
        }
        System.out.println("");
        System.out.println("Histogram for E-mails");
        for (String email : histogram3.getEntries()) {
            System.out.println(email + ":" + histogram3.getCount(email));
        }
    }
    
        public static String[] DomainString (Mail[] mail){
        String[] mailstring = new String[mail.length];
        for (int i = 0; i < mail.length; i++) {
            mailstring[i] = mail[i].getDomain();
        }
        return mailstring;
    }
}