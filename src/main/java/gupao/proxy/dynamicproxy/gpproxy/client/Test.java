package gupao.proxy.dynamicproxy.gpproxy.client;


/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        GpMeipo gpMeipo = new GpMeipo();
        IPerson zhangsan = gpMeipo.getInstance(new Zhangsan());
        zhangsan.findLove();
        zhangsan.testParam("I love u");


//        IPerson zhaoliu = jdkMeipo.getInstance(new ZhaoLiu());
//        zhaoliu.findLove();
//        zhaoliu.buyInsure();


    }
}
