package gupao.strategy.homework.encrypt;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class Test {

    public static void main(String[] args) {
        EncryptContext context = new EncryptContext(EncryptStrategy.getEncrypt(EncryptStrategy.BASE64));
        context.encrypt("12314");
    }
}
