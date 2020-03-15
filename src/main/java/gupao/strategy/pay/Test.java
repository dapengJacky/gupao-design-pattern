package gupao.strategy.pay;

import gupao.strategy.pay.payport.PayStrategy;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order("D1314151315141","123",600);
        System.out.println(order.pay(PayStrategy.PayKey.ALI_PAY));
    }
}
