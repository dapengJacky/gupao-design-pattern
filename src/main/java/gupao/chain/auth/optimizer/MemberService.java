package gupao.chain.auth.optimizer;


import gupao.chain.auth.Member;

/**
 * Created by Tom.
 */
public class MemberService {

    public void login(String loginName,String loginPass){
        Handler validate = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validate.nextHandler(loginHandler);
        loginHandler.nextHandler(authHandler);

        Member member = new Member(loginName,loginPass);
        validate.doHandler(member);
    }

}
