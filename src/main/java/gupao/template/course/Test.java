package gupao.template.course;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class Test {

    public static void main(String[] args) {
        AbstractCourse course = new JavaCourse();
        course.teachCourse();
        System.out.println("===========================");
        course = new PythonCourse();
        course.teachCourse();
    }
}
