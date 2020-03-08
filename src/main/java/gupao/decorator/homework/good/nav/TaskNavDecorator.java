package gupao.decorator.homework.good.nav;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class TaskNavDecorator extends NavDecorator {

    public TaskNavDecorator(INav nav) {
        super(nav);
    }

    /**
     * 登录的权限
     * @return
     */
    @Override
    public String showNav() {
        return nav.showNav()+"--作业";
    }
}
