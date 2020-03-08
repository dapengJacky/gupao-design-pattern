package gupao.flyweight.general;

/**
 * @author peng.chen12@hand-china.com
 * @description 具体享元对象
 * @date 2020/3/8
 */
public class ConcreteFlyWeight implements IFlyWeight {

    private String intrinsicState;

    public ConcreteFlyWeight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }


    public void operation(String extrinsicState) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("IntrinsicState: " + this.intrinsicState);
        System.out.println("ExtrinsicState: " + extrinsicState);
    }
}
