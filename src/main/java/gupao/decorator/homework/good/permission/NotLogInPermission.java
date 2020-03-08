package gupao.decorator.homework.good.permission;

import gupao.decorator.homework.good.nav.CommonNav;

/**
 * @author peng.chen12@hand-china.com
 * @description 未登录权限导航栏
 * @date 2020/3/8
 */
public class NotLogInPermission implements IPermissionNav {

    @Override
    public String showPermNav() {
        return new CommonNav().showNav();
    }
}
