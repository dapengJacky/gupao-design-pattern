package gupao.decorator.homework;

import java.util.*;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/5
 */
public class PrivilegeConstants {

    private static List<String> baseFunctionList = new ArrayList<String>(Arrays.asList("问答","文章","精品课","冒泡","商城"));

    interface FunctionPrivilege{
        List<String> BASE = baseFunctionList;
        List<String> LOGIN = Arrays.asList("作业","题库","成长墙");
        List<String> TEACHER = Collections.singletonList("批改作业");
    }
}
