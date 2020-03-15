package gupao.chain.auth.optimizer;

import gupao.chain.auth.Member;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class Test {

    public static void main(String[] args) {
        Handler validate = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validate.nextHandler(loginHandler);
        loginHandler.nextHandler(authHandler);

        Member member = new Member("jacky","666");
        validate.doHandler(member);

    }
}
