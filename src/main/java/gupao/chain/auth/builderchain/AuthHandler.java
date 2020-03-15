package gupao.chain.auth.builderchain;

import gupao.chain.auth.Member;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class AuthHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if(!"管理员".equals(member.getRoleName())){
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("允许操作");
        if(this.next!=null){
            this.next.doHandler(member);
        }
    }
}
