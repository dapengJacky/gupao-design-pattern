package gupao.decorator.v2;

/**
 * @author peng.chen12@hand-china.com
 * @description 默认的煎饼果子
 * @date 2020/3/5
 */
public class BaseBatterCake extends BatterCake{

    @Override
    protected String buy() {
        return "煎饼果子";
    }

    @Override
    protected int price() {
        return 5;
    }
}
