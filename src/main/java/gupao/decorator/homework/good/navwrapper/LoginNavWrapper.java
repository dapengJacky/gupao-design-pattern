package gupao.decorator.homework.good.navwrapper;

import gupao.decorator.homework.good.nav.CommonNav;
import gupao.decorator.homework.good.nav.INav;
import gupao.decorator.homework.good.nav.QuestionNavDecorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class LoginNavWrapper {

    private static List<INav> loginNavs = new ArrayList<INav>();

    static {
        loginNavs.add(new QuestionNavDecorator(new CommonNav()));
    }

    public void addChild(INav nav){
        loginNavs.add(nav);
    }

    public void remove(INav nav){
        loginNavs.remove(nav);
    }

    public INav get(){
        return loginNavs.get(0);
    }

}
