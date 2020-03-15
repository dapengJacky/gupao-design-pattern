package gupao.chain.auth.optimizer;

import gupao.chain.auth.Member;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        Member m = checkExists(member.getUsername(),member.getPassword());
        if(null == m){
            System.out.println("用户不存在");
            return;
        }
        System.out.println("登录成功！");
        if(this.next!=null){
            this.next.doHandler(m);
        }
    }

    private Member checkExists(String loginName,String loginPass){
        Member member = new Member(loginName,loginPass);
        member.setRoleName("管理员");
//        member.setRoleName("普通会员");
        return member;
    }
}
