package practice.decorator;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/9
 */
public class SuperDressDecorator extends DressDecorator {

    public SuperDressDecorator(Person component) {
        super(component);
    }

    @Override
    protected String dress() {
        return super.dress()+",超人红内裤";
    }
}
