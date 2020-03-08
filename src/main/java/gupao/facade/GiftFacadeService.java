package gupao.facade;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class GiftFacadeService {

    private OrderPayService payService = new OrderPayService();
    private OrderShippingService shippingService = new OrderShippingService();
    private OrderQualifyService qualifyService = new OrderQualifyService();

    public void exchange(GiftInfo giftInfo){
        if(qualifyService.qualifyScoreAndInv(giftInfo)){
            if(payService.pay(giftInfo)){
                String num=shippingService.shippingProd(giftInfo);
                System.out.println("物流订单号:"+num);
            }
        }
    }
}
