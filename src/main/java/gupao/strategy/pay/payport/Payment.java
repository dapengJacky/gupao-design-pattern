package gupao.strategy.pay.payport;

import gupao.strategy.pay.MsgResult;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/14
 */
public abstract class Payment {
    /**
     * 支付方式名称
     * @return
     */
    public abstract String getName();

    //通用逻辑放到抽象类里面实现
    public MsgResult payOrder(String uid, double amount){
        //判断余额是否充足
        if(queryBalance(uid)<amount){
            return new MsgResult(500,"余额不足,支付失败",null);
        }
        return new MsgResult(200,"支付成功","支付金额"+amount);
    }

    /**
     * 查询余额
     * @return
     */
    protected abstract double queryBalance(String uid);

}
