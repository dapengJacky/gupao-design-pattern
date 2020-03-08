package gupao.flyweight.jdk;

/**
 * @author peng.chen12@hand-china.com
 * @description Integer享元
 * @date 2020/3/8
 */
public class IntegerTest {

    public static void main(String[] args) {
        Integer s1 = Integer.valueOf(100);
        Integer s2 = 100;

        Integer s3 = Integer.valueOf(127);
        Integer s4 = 127;

        Integer s5 = Integer.valueOf(128);
        Integer s6 = 128;

        System.out.println(s1==s2);//true
        System.out.println(s3==s4);//true
        System.out.println(s5==s6);//false

    }
}
