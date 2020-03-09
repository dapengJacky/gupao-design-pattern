package practice.decorator;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/9
 */
public abstract class DressDecorator extends Person{

    protected Person component;

    public DressDecorator(Person component) {
        this.component = component;
    }

    @Override
    protected String dress() {
        return this.component.dress();
    }
}
