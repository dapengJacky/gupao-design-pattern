package gupao.strategy.promotion;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/6
 */
public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("组团购买优惠");
    }
}
