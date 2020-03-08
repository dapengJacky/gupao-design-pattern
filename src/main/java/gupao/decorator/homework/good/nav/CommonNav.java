package gupao.decorator.homework.good.nav;


/**
 * @author peng.chen12@hand-china.com
 * @description 通用导航栏
 * @date 2020/3/8
 */
public class CommonNav implements INav {

    @Override
    public String showNav() {
        return "问答--文章--精品课--冒泡--商城";
    }
}
