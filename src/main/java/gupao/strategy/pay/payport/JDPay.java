package gupao.strategy.pay.payport;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/14
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 300;
    }
}
