package gupao.delegate.simple;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class EmployeeA implements IEmployee {

    private String goodAt="programming";

    @Override
    public void doing(String task) {
        System.out.println("我是员工A，我擅长"+goodAt+",现在开始做"+goodAt);
    }
}
