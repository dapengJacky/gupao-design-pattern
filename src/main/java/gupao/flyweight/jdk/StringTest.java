package gupao.flyweight.jdk;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/8
 */
public class StringTest {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hel"+"lo";
        String s4 = "hel" +new String("lo");
        String s5 = new String("hello");
        String s6 = "hel";
        String s7 = "lo";
        String s8 = s6+s7;
        String s9 = s6.intern()+s7.intern();
        String s10 = s5.intern();


        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//true
        System.out.println(s1==s4);//false
        System.out.println(s1==s5);//false
        System.out.println(s1==s8);//false
        System.out.println(s1==s9);//false
        System.out.println(s1==s10);//true
    }
}
