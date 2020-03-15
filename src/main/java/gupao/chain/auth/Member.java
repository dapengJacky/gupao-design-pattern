package gupao.chain.auth;

import lombok.Data;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
@Data
public class Member {

    private String username;
    private String password;
    private String roleName;

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
