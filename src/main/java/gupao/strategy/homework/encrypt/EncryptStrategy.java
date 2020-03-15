package gupao.strategy.homework.encrypt;

import org.omg.IOP.ENCODING_CDR_ENCAPS;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class EncryptStrategy {

    private static final Map<String,IEncrypt> ENCRYPT_MAP = new HashMap<>();
    public static final String SHA = "SHA";
    public static final String BASE64 = "BASE64";
    public static final String MD5 = "MD5";

    static {
        ENCRYPT_MAP.put(SHA,new SHA());
        ENCRYPT_MAP.put(BASE64,new Base64());
        ENCRYPT_MAP.put(MD5,new Md5Encrypt());
    }

    public static IEncrypt getEncrypt(String encryptKey){
        if(!ENCRYPT_MAP.containsKey(encryptKey)){
            return ENCRYPT_MAP.get(MD5);
        }
        return ENCRYPT_MAP.get(encryptKey);
    }

}
