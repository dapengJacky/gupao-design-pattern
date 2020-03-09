package practice.decorator;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/9
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jacky");
        System.out.println(person.dress());

        Person person1 = new HatDressDecorator(person);
        System.out.println(person1.dress());

        person = new SuperDressDecorator(person);
        System.out.println(person.dress());
    }
}
