package MyUltis;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author NhanNT
 */
public class Tool {

    public static String getMd5(String input) {
        try {

            // Static getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("MD5");
            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
            byte[] messageDigest = md.digest(input.getBytes());
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest);
            // Convert message digest into hex value 
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static String reduceStr(String input) {
        String result = "";
        String[] words = input.split("\\s+");
        int num = 0;
        while(result.length() <= 15 && words.length > num){
            result += words[num] + " ";
            num ++;
        }
        return result + "...";
    }
    
    public static String reduceStrShorter(String input) {
        String result = "";
        String[] words = input.split("\\s+");
        int num = 0;
        while(result.length() <= 10 && words.length > num){
            result += words[num] + " ";
            num ++;
        }
        return result + "...";
    }
    
    public static void main(String[] args) {
        String str = Tool.reduceStr("nhan thanh nhan thanh nhan thanh nhan thanhnhan thanhnhan thanh");
        System.out.println(str);
    }
    
}
