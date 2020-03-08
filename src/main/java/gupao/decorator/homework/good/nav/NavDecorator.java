package gupao.decorator.homework.good.nav;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public abstract class NavDecorator implements INav {

    protected INav nav;

    public NavDecorator(INav nav) {
        this.nav = nav;
    }

    @Override
    public abstract String showNav();
}
