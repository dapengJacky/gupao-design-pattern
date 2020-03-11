package gupao.adapter.login.homework;

import gupao.adapter.login.ResultMsg;
import gupao.adapter.login.v2.ILoginAdapter;

/**
 * @author peng.chen12@hand-china.com
 * @description 客户端调用：接口方法改造->不修改接口也能实现自动适配
 * @date 2020/3/11
 */
public interface IPassportForThirdParty {

    ResultMsg loginForThirdParty(String openId,Class<? extends ILoginAdapter> clazz);

}
