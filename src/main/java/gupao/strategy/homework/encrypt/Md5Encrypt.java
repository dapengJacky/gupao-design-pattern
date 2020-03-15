package gupao.strategy.homework.encrypt;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class Md5Encrypt implements IEncrypt{
    @Override
    public void doEncrypt(String password) {
        System.out.println("使用md5加密:"+password);
    }
}
