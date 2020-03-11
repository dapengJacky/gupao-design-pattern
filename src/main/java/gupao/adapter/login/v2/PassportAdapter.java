package gupao.adapter.login.v2;

import gupao.adapter.login.PassportService;
import gupao.adapter.login.ResultMsg;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public class PassportAdapter extends PassportService implements IPassportForThirdParty {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return processLogin(openId,LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForEmail(String email, String code) {
        return processLogin(email,LoginForEmailAdapter.class);
    }

    @Override
    public ResultMsg loginForTel(String phone, String code) {
        return processLogin(phone,LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token,LoginForTokenAdapter.class);
    }

    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz){

        try {
            ILoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(id,null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
