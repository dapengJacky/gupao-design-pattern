package gupao.decorator.homework.my;

import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class LoginPrivilegeDecorator extends PrivilegeDecorator {

    public LoginPrivilegeDecorator(IPrivilege privilege) {
        super(privilege);
    }

    @Override
    public List<String> getFunction() {
        List<String> function = super.getFunction();
        function.addAll(PrivilegeConstants.FunctionPrivilege.LOGIN);
        return function;
    }
}
