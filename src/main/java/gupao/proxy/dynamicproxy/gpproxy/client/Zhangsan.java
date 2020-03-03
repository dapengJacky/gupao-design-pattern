package gupao.proxy.dynamicproxy.gpproxy.client;

/**
 * Created by Tom.
 */
public class Zhangsan implements IPerson {

    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }

    public void buyInsure() {
        System.out.println("30万");
    }

    @Override
    public void testParam(String param) {
        System.out.println("代理模式添加参数:"+param);
    }
}
