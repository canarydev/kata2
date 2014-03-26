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

}