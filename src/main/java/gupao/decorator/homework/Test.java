package gupao.decorator.homework;

import java.util.HashSet;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class Test {

    public static void main(String[] args) {
        IPrivilege privilege = new BasePrivilege();
        System.out.println(privilege.getFunction().toString());

        privilege = new LoginPrivilegeDecorator(privilege);
        System.out.println(privilege.getFunction().toString());

        privilege = new TeacherPrivilegeDecorator(privilege);
        System.out.println(new HashSet<String>(privilege.getFunction()).toString());


    }
}
