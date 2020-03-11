package gupao.adapter.login.v1;

import gupao.adapter.login.PassportService;
import gupao.adapter.login.ResultMsg;
import org.apache.commons.lang.StringUtils;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public class PassportAdapter extends PassportService implements IPassportForThirdParty {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return registForLogin(openId,null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return registForLogin(openId,null);
    }

    @Override
    public ResultMsg loginForEmail(String email, String code) {
        return registForLogin(email,null);
    }

    @Override
    public ResultMsg loginForTel(String phone, String code) {
        return registForLogin(phone,null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return registForLogin(token,null);
    }

    private ResultMsg registForLogin(String username, String password){
        if(StringUtils.isEmpty(password)){
            password="THIRD_PARTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
