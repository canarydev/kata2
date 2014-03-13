package Kata2;

public class Mail {
    static String mail;
    static String user;
    static String domain;
    
    public static void Mail(String mail){
        setMail(mail);
        setUser(mail);
        setDomain(mail);
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

    public static void setUser(String mail) {
        user = mail.substring(0,mail.indexOf("@")-1);
    }

    public static String getDomain() {
        return domain;
    }

    public static void setDomain(String mail) {
        domain = mail.substring(mail.indexOf("@")+1);
    }
}