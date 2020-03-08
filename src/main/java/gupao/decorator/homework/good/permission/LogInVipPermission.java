package gupao.decorator.homework.good.permission;

import gupao.decorator.homework.good.navwrapper.LoginVipNavWrapper;

/**
 * @author peng.chen12@hand-china.com
 * @description 登录VIP权限导航栏
 * @date 2020/3/8
 */
public class LogInVipPermission implements IPermissionNav {

    @Override
    public String showPermNav() {
        return new LoginVipNavWrapper().get().showNav();
    }
}
