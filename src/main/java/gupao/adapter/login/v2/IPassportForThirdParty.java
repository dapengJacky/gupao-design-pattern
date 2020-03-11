package gupao.adapter.login.v2;

import gupao.adapter.login.ResultMsg;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public interface IPassportForThirdParty {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForEmail(String email, String code);

    ResultMsg loginForTel(String phone, String code);

    ResultMsg loginForToken(String token);
}
