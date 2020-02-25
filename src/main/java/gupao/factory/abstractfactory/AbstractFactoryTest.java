package gupao.factory.abstractfactory;

import gupao.factory.simple.ICourse;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/24
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        INote note = factory.createNote();
        note.edit();

        CourseFactory factory1 = new PythonCourseFactory();
        IVideo video = factory1.createVideo();
        video.record();
    }
}
