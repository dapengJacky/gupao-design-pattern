package gupao.decorator.v2;

/**
 * @author peng.chen12@hand-china.com
 * @description 装饰器
 * @date 2020/3/5
 */
public abstract class BatterCakeDecorator extends BatterCake{

    protected BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake){
        this.batterCake = batterCake;
    }

    @Override
    protected String buy() {
        return batterCake.buy();
    }

    @Override
    protected int price() {
        return batterCake.price();
    }

}
