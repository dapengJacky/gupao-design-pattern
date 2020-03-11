package gupao.adapter.login.v2;

import gupao.adapter.login.ResultMsg;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public interface ILoginAdapter {

    boolean support(Object adapter);

    ResultMsg login(String id,Object adapter);
}
