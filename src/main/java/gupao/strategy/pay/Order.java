package gupao.strategy.pay;

import gupao.strategy.pay.payport.PayStrategy;
import gupao.strategy.pay.payport.Payment;
import lombok.Data;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
@Data
public class Order {

    private String orderId;
    private String uid;
    private double amount;

    public Order(String orderId, String uid, double amount) {
        this.orderId = orderId;
        this.uid = uid;
        this.amount = amount;
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.getPayWay(payKey);
        System.out.println("欢迎使用"+payment.getName()+"支付");
        System.out.println("支付金额:"+amount+",开始扣款");
        return payment.payOrder(uid,amount);
    }
}
