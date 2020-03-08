package gupao.decorator.homework.good.navwrapper;

import gupao.decorator.homework.good.nav.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class AdminNavWrapper {

    private static List<INav> adminNavs = new ArrayList<INav>();

    static {
        adminNavs.add(new UserManageNavDecorator(new TaskNavDecorator(new GrowWallNavDecorator(new QuestionNavDecorator(new CommonNav())))));
    }

    public INav get(){
        return adminNavs.get(0);
    }
}
