package gupao.build.paractice;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/4
 */
public class JavaCourse extends AbstractCourse {

    public JavaCourse(){}

    @Override
    public String toString() {
        return "JavaCourse{" +
                "note='" + note + '\'' +
                ", video='" + video + '\'' +
                ", homework='" + homework + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}
