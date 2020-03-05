package gupao.decorator.v2;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class BatterCakeEggDecorator extends BatterCakeDecorator {

    public BatterCakeEggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String buy() {
        return super.buy()+"+1个鸡蛋";
    }

    @Override
    protected int price() {
        return super.price()+1;
    }
}
