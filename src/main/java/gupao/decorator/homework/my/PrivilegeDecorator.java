package gupao.decorator.homework.my;

import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class PrivilegeDecorator implements IPrivilege {

    protected IPrivilege privilege;


    public PrivilegeDecorator(IPrivilege privilege){
        this.privilege = privilege;
    }

    @Override
    public List<String> getFunction() {
        return privilege.getFunction();
    }
}
