package gupao.proxy.staticproxy;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/2
 */
public class Test {

    public static void main(String[] args) {
        IPerson person = new ZhangSanFather(new Zhangsan());
        person.findLove();
    }
}
