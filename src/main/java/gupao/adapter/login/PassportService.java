package gupao.adapter.login;

import gupao.adapter.login.ResultMsg;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public class PassportService {

    /**
     * 注册方法
     * @param username
     * @param passowrd
     * @return
     */
    public ResultMsg regist(String username, String passowrd){
        return new ResultMsg(200,"注册成功",passowrd);
    }


    public ResultMsg login(String username,String password){
        return new ResultMsg(200,"登录成功");
    }

}
