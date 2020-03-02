package gupao.proxy.dynamicproxy.jdkproxy;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/2
 */
public class Test {

    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangSan =  jdkMeipo.getProxyInstance(new Zhangsan());
        zhangSan.findLove();

        IPerson zhaoLiu =  jdkMeipo.getProxyInstance(new ZhaoLiu());
        zhaoLiu.findLove();
        zhaoLiu.purchaseInsurance();
    }
}
