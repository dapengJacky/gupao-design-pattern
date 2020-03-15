package gupao.strategy.pay.payport;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/14
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
