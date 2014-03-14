package Kata2;

public class Mail {
    static String mail;
    static String user;
    static String domain;
    
    public static void Mail(){
        mail = "user@domain";
        user = "user";
        domain = "domain";
    }

    public static Mail Mail(String mail){
        Mail email = new Mail();
        setMail(mail);
        setUser(mail);
        setDomain(mail);
        return email;
    }

    public static String getMail() {
        return mail;
    }

    public static void setMail(String mail) {
        Mail.mail = mail;
    }

    public static String getUser() {
        return user;
    }

    public static String getUser(Mail mail) {
        return user;
    }
    
    public static void setUser(String mail) {
        user = mail.substring(0,mail.indexOf("@"));
    }

    public static String getDomain() {
        return domain;
    }

    public static String getDomain(Mail mail) {
        return domain;
    }
    
    public static void setDomain(String mail) {
        domain = mail.substring(mail.indexOf("@")+1);
    }
    
    public static Mail StringToMail(String mailstring){
        Mail email;
        email = Mail(mailstring);
        return email;
    }
    
    public static Mail[] StringToMail(String[] mailstring){
        Mail[] mailarray = new Mail [mailstring.length];
        for (int i = 0; i < mailarray.length; i++) {
            mailarray[i] = StringToMail(mailstring[i]);
        }
        return mailarray;
    }
    
    public static void Mailcounter (Mail[] mail){
        for (int i = 0; i < mail.length; i++) {
            System.out.println((getUser()+"@"+getDomain()));      
        }
    }
}