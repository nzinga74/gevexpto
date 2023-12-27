/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils.providers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author nzinga
 */
public class JEncript {

    public static String encript(String password) throws NoSuchAlgorithmException {
        if (password.length() == 0) {
            return null;
        } else {
            MessageDigest md = MessageDigest.getInstance("SHA1");
            md.update(password.getBytes());
            byte[] hash = md.digest();
            StringBuffer passwordEncrip = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                passwordEncrip.append(Integer.toHexString(hash[i] & 0xff));
            }
            return passwordEncrip.toString();
        }

    }
    public static boolean compareHash(String password, String passwordHash){
       try {
        String payload = JEncript.encript(password);
        return passwordHash.compareTo(payload) == 0;
       }
       catch (Exception e) {
           return false;
       }
       
    }
}
