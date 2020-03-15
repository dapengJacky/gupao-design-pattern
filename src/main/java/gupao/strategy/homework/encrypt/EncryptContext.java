package gupao.strategy.homework.encrypt;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class EncryptContext {

    private IEncrypt encrypt;

    public EncryptContext(IEncrypt encrypt) {
        this.encrypt = encrypt;
    }

    public void encrypt(String password){
        this.encrypt.doEncrypt(password);
    }
}
