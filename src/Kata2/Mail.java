package Kata2;

public class Mail {
    String user;
    String domain;   
    
    public Mail(String mail){
        setUser(mail);     
        setDomain(mail);
    }

    public String getUser() {
        return user;
    }
    
    private void setUser(String mailstring) {
        user = mailstring.substring(0,mailstring.indexOf("@"));
    }

    public String getDomain() {
        return domain;
    }

    private void setDomain(String mailstring) {
        domain = mailstring.substring(mailstring.indexOf("@")+1);
    }
    
}