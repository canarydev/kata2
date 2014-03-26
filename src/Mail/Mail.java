package Mail;

public class Mail {
    String user;
    String domain;   
    
    public Mail(String mail){
        setUser(mail);     
        setDomain(mail);
    }
    
    public Mail[] VectorMail(String[] mail){
        Mail[] email = new Mail [mail.length];
        for (int i = 0; i < mail.length; i++) {
            email[i]= new Mail(mail[i]);
        }
        return email;
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