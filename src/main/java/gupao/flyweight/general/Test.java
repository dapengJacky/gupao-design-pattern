package gupao.flyweight.general;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class Test {

    public static void main(String[] args) {
        IFlyWeight flyweight1 = FlyWeightFacotry.getFlyWeight("aa");
        IFlyWeight flyweight2 = FlyWeightFacotry.getFlyWeight("bb");
        flyweight1.operation("a");
        flyweight2.operation("b");
    }
}
