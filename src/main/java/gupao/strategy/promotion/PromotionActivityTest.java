package gupao.strategy.promotion;

import org.apache.commons.lang.StringUtils;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/6
 */
public class PromotionActivityTest {

    public static void main(String[] args) {
//        PromotionActivity activity;

        String promotionKey = "CASHBACK";

//        if(StringUtils.equals("COUPON",promotionKey)){
//            activity = new PromotionActivity(new CouponStrategy());
//        }else if(StringUtils.equals("CASHBACK",promotionKey)){
//            activity = new PromotionActivity(new CashBackStrategy());
//        }else if(StringUtils.equals("GROUPBUY",promotionKey)){
//            activity = new PromotionActivity(new GroupBuyStrategy());
//        }else{
//            activity = new PromotionActivity(new EmptyStrategy());
//        }
//        activity.execute();

        PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        activity.execute();
    }
}
