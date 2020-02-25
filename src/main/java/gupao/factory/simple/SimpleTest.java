package gupao.factory.simple;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/24
 */
public class SimpleTest {

    public static void main(String[] args) {
        ICourse course = CourseFactory.createCourse(PythonCourse.class);
        course.record();
    }


}
