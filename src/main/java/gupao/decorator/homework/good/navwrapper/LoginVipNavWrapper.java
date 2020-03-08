package gupao.decorator.homework.good.navwrapper;

import gupao.decorator.homework.good.nav.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class LoginVipNavWrapper {

    private static List<INav> loginVipNavs = new ArrayList<INav>();

    static {
        loginVipNavs.add(new TaskNavDecorator(new GrowWallNavDecorator(new QuestionNavDecorator(new CommonNav()))));
    }

    public INav get(){
        return loginVipNavs.get(0);
    }
}
