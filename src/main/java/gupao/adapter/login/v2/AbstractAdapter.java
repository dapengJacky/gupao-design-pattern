package gupao.adapter.login.v2;

import gupao.adapter.login.PassportService;
import gupao.adapter.login.ResultMsg;
import org.apache.commons.lang.StringUtils;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public abstract class AbstractAdapter extends PassportService implements ILoginAdapter {


    protected ResultMsg registForLogin(String username, String password){
        if(StringUtils.isEmpty(password)){
            password="THIRD_PARTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
