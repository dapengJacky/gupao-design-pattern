package gupao.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class Leader implements IEmployee{

    private static final Map<String,IEmployee> map = new HashMap<String, IEmployee>();

    static {
        map.put("programming",new EmployeeA());
        map.put("crawl",new EmployeeB());
    }
    @Override
    public void doing(String task) {
        if(!map.containsKey(task)){
            System.out.println("不在我的能力范围之内");
            return;
        }
        map.get(task).doing(task);
    }
}
