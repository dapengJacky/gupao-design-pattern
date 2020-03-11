package gupao.adapter.login.homework;

import gupao.adapter.login.ResultMsg;
import gupao.adapter.login.v2.ILoginAdapter;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public class PassportForThirdPartyAdapter implements IPassportForThirdParty {

    @Override
    public ResultMsg loginForThirdParty(String openId, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(openId,adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
