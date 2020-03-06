package gupao.strategy.promotion;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/6
 */
public class PromotionActivity {

    private PromotionStrategy strategy;

    public PromotionActivity(PromotionStrategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        this.strategy.doPromotion();
    }
}
