package gupao.chain.auth.builderchain;

import gupao.chain.auth.Member;
import org.apache.commons.lang.StringUtils;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class ValidateHandler extends Handler {

    @Override
    public void doHandler(Member member) {
        if(StringUtils.isEmpty(member.getUsername()) ||
                StringUtils.isEmpty(member.getPassword())){
            System.out.println("用户名和密码为空");
            return;
        }
        System.out.println("用户名和密码不为空，可以往下执行");

        if(this.next!=null){
            this.next.doHandler(member);
        }
    }
}
