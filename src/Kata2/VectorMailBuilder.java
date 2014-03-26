package Kata2;

public class VectorMailBuilder {
    public static Mail[] build(String[] mail) {
        Mail[] email = new Mail [mail.length];
        for (int i = 0; i < mail.length; i++) {
            email[i]= new Mail(mail[i]);
        }
        return email;
    }
}
