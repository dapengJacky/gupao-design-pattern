package gupao.proxy.dynamicproxy.cglibproxy;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/2
 */
public class Test {

    public static void main(String[] args) {
        Zhangsan proxy = (Zhangsan) new CglibMeipo().getProxyInstance(Zhangsan.class);
        proxy.findLove();

    }
}
