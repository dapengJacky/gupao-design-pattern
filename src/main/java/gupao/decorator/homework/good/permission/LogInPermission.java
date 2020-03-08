package gupao.decorator.homework.good.permission;

import gupao.decorator.homework.good.navwrapper.LoginNavWrapper;

/**
 * @author peng.chen12@hand-china.com
 * @description 登录权限导航栏
 * @date 2020/3/8
 */
public class LogInPermission implements IPermissionNav {

    @Override
    public String showPermNav() {
        return new LoginNavWrapper().get().showNav();
    }
}
