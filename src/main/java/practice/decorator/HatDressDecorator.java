package practice.decorator;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/9
 */
public class HatDressDecorator extends DressDecorator {


    public HatDressDecorator( Person component) {
        super(component);
    }

    @Override
    protected String dress() {
        return super.dress()+",棒球帽";
    }
}
