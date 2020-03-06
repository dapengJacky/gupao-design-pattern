package gupao.strategy.promotion;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/6
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
