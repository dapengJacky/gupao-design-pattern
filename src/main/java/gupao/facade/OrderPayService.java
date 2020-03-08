package gupao.facade;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class OrderPayService {

    public boolean pay(GiftInfo info){
        System.out.println(info.getName()+"商品积分支付成功");
        return true;
    }
}
