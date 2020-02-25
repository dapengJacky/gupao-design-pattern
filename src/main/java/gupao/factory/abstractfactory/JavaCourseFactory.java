package gupao.factory.abstractfactory;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/24
 */
public class JavaCourseFactory extends CourseFactory {

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }

}
