package gupao.strategy.pay.payport;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/14
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联";
    }

    @Override
    protected double queryBalance(String uid) {
        return 100;
    }
}
