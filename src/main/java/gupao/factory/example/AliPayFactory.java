package gupao.factory.example;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/24
 */
public class AliPayFactory extends DomesticPayFactory {

    @Override
    public void pay() {
        System.out.println("调用支付宝接口实现");
    }
}
