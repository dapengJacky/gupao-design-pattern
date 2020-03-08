package gupao.decorator.homework.good.nav;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class QuestionNavDecorator extends NavDecorator {

    public QuestionNavDecorator(INav nav) {
        super(nav);
    }

    @Override
    public String showNav() {
        return nav.showNav()+"--题库";
    }
}
