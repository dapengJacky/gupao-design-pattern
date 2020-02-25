package gupao.factory.factorymethod;


/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/24
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.create().record();
    }
}
