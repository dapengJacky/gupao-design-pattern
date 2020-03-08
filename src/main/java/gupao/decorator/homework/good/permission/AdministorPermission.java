package gupao.decorator.homework.good.permission;

import gupao.decorator.homework.good.navwrapper.AdminNavWrapper;

/**
 * @author peng.chen12@hand-china.com
 * @description 管理员权限导航栏
 * @date 2020/3/8
 */
public class AdministorPermission implements IPermissionNav {

    @Override
    public String showPermNav() {
        return new AdminNavWrapper().get().showNav();
    }
}
