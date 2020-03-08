package gupao.decorator.homework.good.nav;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class UserManageNavDecorator extends NavDecorator {

    public UserManageNavDecorator(INav nav) {
        super(nav);
    }

    @Override
    public String showNav() {
        return nav.showNav()+"--用户管理";
    }
}
