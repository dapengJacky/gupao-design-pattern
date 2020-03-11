package gupao.adapter.login.homework;


import gupao.adapter.login.ResultMsg;
import gupao.adapter.login.v2.LoginForQQAdapter;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public class Test {

    public static void main(String[] args) {
        PassportForThirdPartyAdapter adapter = new PassportForThirdPartyAdapter();
        ResultMsg msg=adapter.loginForThirdParty("fqdaqfqdad", LoginForQQAdapter.class);
        System.out.println(msg.getMsg());
    }
}
