package gupao.prototype.deep;


import java.util.ArrayList;
import java.util.List;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/2
 */
public class Client {

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(19);
        prototype.setName("jacky");
        List<String> hobbies= new ArrayList<String>();
        hobbies.add("打篮球");
        hobbies.add("乒乓球");
        prototype.setHobbies(hobbies);

        ConcretePrototype clonePrototype = prototype.deepClone();
        clonePrototype.getHobbies().add("Swimming");
        System.out.println("原型对象："+prototype);
        System.out.println("克隆对象："+clonePrototype);
        System.out.println(prototype==clonePrototype);//false
        System.out.println("原型对象爱好："+prototype.getHobbies());
        System.out.println("克隆对象爱好："+clonePrototype.getHobbies());
        System.out.println(prototype.getHobbies()==clonePrototype.getHobbies());//false
    }
}
