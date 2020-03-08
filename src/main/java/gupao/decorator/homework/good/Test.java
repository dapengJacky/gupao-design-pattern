package gupao.decorator.homework.good;

import gupao.decorator.homework.good.permission.*;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class Test {

    public static void main(String[] args) {
        IPermissionNav nav;
        nav = new NotLogInPermission();
        System.out.println(nav.showPermNav());

        nav = new LogInPermission();
        System.out.println(nav.showPermNav());

        nav = new LogInVipPermission();
        System.out.println(nav.showPermNav());

        nav = new AdministorPermission();
        System.out.println(nav.showPermNav());
    }
}
