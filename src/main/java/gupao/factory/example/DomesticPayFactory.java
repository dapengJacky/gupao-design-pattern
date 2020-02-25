package gupao.factory.example;

/**
 * 国内支付接口
 */
public abstract class DomesticPayFactory implements OrderPayFactory{

    public abstract void pay();

}
