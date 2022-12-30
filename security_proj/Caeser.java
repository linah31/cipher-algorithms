package security_proj;
public class Caeser {
    static String alpha = "abcdefghijklmnopqrstuvwxyz";
    public static String Caeser_enc(String plain , int key)
    {
        String cipher = "";
        for(int i = 0; i<plain.length();i++)
        {
            char x = plain.charAt(i);
            int index = alpha.indexOf(x);
            int newIndex = (index + key)%26;
            char y = alpha.charAt(newIndex);
            cipher += y;
        }
        return cipher;
    }
    public static String Caeser_dec(String cipher , int key)
    {
        String plain = "";
        for(int i = 0; i<cipher.length();i++)
        {
            char x = cipher.charAt(i);
            int index = alpha.indexOf(x);
            int newIndex = (index - key + 26)%26;
            char y = alpha.charAt(newIndex);
            plain += y;
        }
        return plain;
    }

}

