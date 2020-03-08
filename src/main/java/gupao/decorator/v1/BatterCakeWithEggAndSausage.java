package gupao.decorator.v1;

/**
 * Created by Tom.
 */
public class BatterCakeWithEggAndSausage extends BattercakeWithEgg {

    protected String getMsg(){ return super.getMsg() + "+1根香肠";}

    public int getPrice(){ return super.getPrice() + 2;}

}
