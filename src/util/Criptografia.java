package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

public class Criptografia {
    
    public static String usuSenha(String usuSenha) {
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(usuSenha.getBytes());
            BASE64Encoder en = new BASE64Encoder();
            return en.encode(md.digest());
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
            return usuSenha;
        }
    }
    
    public static String usuSenha(char[] usuSenha) {
        String pwd = null;    
        try{
            pwd = String.valueOf(usuSenha);
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(pwd.getBytes());
            BASE64Encoder en = new BASE64Encoder();
            return en.encode(md.digest());
        }catch(NoSuchAlgorithmException e){
            e.printStackTrace();
            return pwd;
        }
    }
}
