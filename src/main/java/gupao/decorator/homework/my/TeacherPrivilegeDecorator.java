package gupao.decorator.homework.my;

import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class TeacherPrivilegeDecorator extends PrivilegeDecorator {

    public TeacherPrivilegeDecorator(IPrivilege privilege) {
        super(privilege);
    }

    @Override
    public List<String> getFunction() {
        List<String> function = super.getFunction();
        function.addAll(PrivilegeConstants.FunctionPrivilege.TEACHER);
        return function;
    }
}
