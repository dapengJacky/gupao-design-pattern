package gupao.adapter.login.v2;

import gupao.adapter.login.ResultMsg;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public class LoginForWechatAdapter extends AbstractAdapter {


    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if(!support(adapter)) return null;

        return super.registForLogin(id,null);
    }
}
