package gupao.decorator.v1;

/**
 * Created by Tom.
 */
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + ",总价：" + battercake.getPrice());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",总价：" + battercakeWithEgg.getPrice());

        BatterCakeWithEggAndSausage battercakeWithEggAndSausage = new BatterCakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + ",总价：" + battercakeWithEggAndSausage.getPrice());
    }

}
