package security_proj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vigenere {
 
 public Vigenere() {}
     private static List<Integer> getCharPositions(String str) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        List<Integer> charsAtPos = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            charsAtPos.add(chars.indexOf(str.charAt(i)));
        } 

        return charsAtPos;
    }

    
   public static String vigencrypt(String text, String key) {
String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        List<Integer> textCharAtPos = getCharPositions(text);
        List<Integer> keyCharAtPos = getCharPositions(key);

        int textLength = text.length();
        int keyLength = key.length();

        String cipher = "";
        int letter;

        for (int n = 0; n < textLength; n++) {
            letter = (textCharAtPos.get(n) + keyCharAtPos.get(n % keyLength));
            //System.out.println("le"+letter);
            letter %= chars.length();
            //System.out.println("le%"+letter);
            cipher += chars.charAt(letter);
            //System.out.println("c+"+cipher);
        }

        return cipher;
    }

    
   public static String vigdecrypt(String cipher, String key) {
String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        List<Integer> cipherCharAtPos = getCharPositions(cipher);
        List<Integer> keyCharAtPos = getCharPositions(key);

        int cipherLength = cipher.length();
        int keyLength = key.length();

        String plainText = "";
        int letter;

        for (int n = 0; n < cipherLength; n++) {
            letter = (cipherCharAtPos.get(n) - keyCharAtPos.get(n % keyLength));
             //System.out.println("le"+letter);
            letter += chars.length();
             // System.out.println("le+"+letter);
            letter %= chars.length();
              //System.out.println("le%"+letter);
            plainText += chars.charAt(letter);
        }

        return plainText;
    }

    // Driver code
    public static void main(String[] args) {
      

        
        
        
        String text = "theboy";
        String key = "vig";

     
      
        String cipher = vigencrypt(text, key);
        String plainText = vigdecrypt(cipher, key);
System.out.println(Arrays.toString(getCharPositions(text).toArray()));
        System.out.println("======================");
        System.out.println("Text: " + text);
        System.out.println("Key: " + key);
        System.out.println("Cipher: " + cipher);
        System.out.println("Plain Text: " + plainText);
    }
    
}

