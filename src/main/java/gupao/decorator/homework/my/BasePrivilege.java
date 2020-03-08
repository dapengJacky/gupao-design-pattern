package gupao.decorator.homework.my;

import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class BasePrivilege implements IPrivilege {

    @Override
    public List<String> getFunction() {
        return PrivilegeConstants.FunctionPrivilege.BASE;
    }
}
