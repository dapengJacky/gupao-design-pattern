package gupao.prototype.general;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/2
 */
public class Client {

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setName("jacky");
        prototype.setAge(18);

        ConcretePrototype cloneProtytpe = (ConcretePrototype)prototype.clone();
        System.out.println("原型对象："+prototype);
        System.out.println("克隆对象："+cloneProtytpe);
    }
}
