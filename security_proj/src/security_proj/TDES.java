/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security_proj;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Linah
 */
public class TDES {
//public String key;
  private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    //private KeySpec mykeySpec;
    //private SecretKeyFactory mySecretKeyFactory;
    //private Cipher cipher;
    //byte[] KeyAsBytes;
    //private String myEncryptionKey;
   // private String myEncryptionScheme;
    //SecretKey key;
    /**
     * @param args the command line arguments
     */
    public TDES() throws Exception
    {
        
        
    }
    
    public static String TDESencrypt(String unencryptedString,String myEncryptionKey) {
        String encryptedString = null;
        try {
           String  myEncryptionScheme=DESEDE_ENCRYPTION_SCHEME;
       byte[] KeyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
       KeySpec mykeySpec = new DESedeKeySpec(KeyAsBytes);
       SecretKeyFactory mySecretKeyFactory = SecretKeyFactory.getInstance(myEncryptionScheme);
       Cipher cipher = Cipher.getInstance(myEncryptionScheme);
       SecretKey key = mySecretKeyFactory.generateSecret(mykeySpec);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] encryptedText = cipher.doFinal(plainText);
            BASE64Encoder base64encoder = new BASE64Encoder();
            encryptedString =  base64encoder.encode(encryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encryptedString;
    }
    
     public static String TDESdecrypt(String encryptedString,String myEncryptionKey) {
        String decryptedText=null;
        try {
          String  myEncryptionScheme=DESEDE_ENCRYPTION_SCHEME;
       byte[] KeyAsBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
        KeySpec mykeySpec = new DESedeKeySpec(KeyAsBytes);
        SecretKeyFactory mySecretKeyFactory = SecretKeyFactory.getInstance(myEncryptionScheme);
        Cipher cipher = Cipher.getInstance(myEncryptionScheme);
       SecretKey key = mySecretKeyFactory.generateSecret(mykeySpec);
            cipher.init(Cipher.DECRYPT_MODE, key);
            BASE64Decoder base64decoder = new BASE64Decoder();
            byte[] encryptedText = base64decoder.decodeBuffer(encryptedString);
            byte[] plainText = cipher.doFinal(encryptedText);
            decryptedText= new String(plainText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decryptedText;
    }
     
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
     
          String deskey ="Triple Data Encryption Standard";
         String target="www.Kensoftph.com";
        String encrypted=TDESencrypt(target,deskey);
        String decrypted=TDESdecrypt(encrypted,deskey);
System.out.println(deskey.length());
        System.out.println("String To Encrypt: "+ target);
        System.out.println("Encrypted String:" + encrypted);
        System.out.println("Decrypted String:" + decrypted);
    }
   
    
}
