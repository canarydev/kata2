package Kata2;

public class Mail {
    private String user;
    private String domain;   
    
    public Mail(String mail){
        user = mail.split("@")[0];
        domain = mail.split("@")[1];
    }

    public String getUser() {
        return user;
    }
    
    public String getDomain() {
        return domain;
    }
    
    /*
    public static String[] DomainString (Mail[] mail){
        String[] mailstring = new String[mail.length];
        for (int i = 0; i < mail.length; i++) {
            mailstring[i] = mail[i].getDomain();
        }
        return mailstring;
    }
     */
    
}