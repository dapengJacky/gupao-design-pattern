package gupao.decorator.v2;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BaseBatterCake();
        System.out.println(batterCake.buy()+"，总价"+batterCake.price());

        batterCake = new BatterCakeBaconDecorator(batterCake);
        System.out.println(batterCake.buy()+"，总价"+batterCake.price());

        batterCake = new BatterCakeEggDecorator(batterCake);
        System.out.println(batterCake.buy()+"，总价"+batterCake.price());

        batterCake = new BatterCakeEggDecorator(batterCake);
        System.out.println(batterCake.buy()+"，总价"+batterCake.price());

    }
}
