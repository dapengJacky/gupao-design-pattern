package gupao.strategy.promotion;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/6
 */
public class CouponStrategy implements  PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("优惠券打折");
    }
}
