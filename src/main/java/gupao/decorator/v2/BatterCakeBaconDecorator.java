package gupao.decorator.v2;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class BatterCakeBaconDecorator extends BatterCakeDecorator {

    public BatterCakeBaconDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String buy() {
        return super.buy()+"+1个培根";
    }

    @Override
    protected int price() {
        return super.price()+3;
    }
}
