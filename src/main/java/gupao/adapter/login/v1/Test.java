package gupao.adapter.login.v1;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/11
 */
public class Test {

    public static void main(String[] args) {
        PassportAdapter adapter = new PassportAdapter();
        adapter.loginForQQ("t1qdfagqwdada");
        System.out.println(adapter.loginForToken("gqeqgqeaffqrqwqafgq").getMsg());
    }
}
