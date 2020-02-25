package gupao.factory.factorymethod;

import gupao.factory.simple.ICourse;
import gupao.factory.simple.PythonCourse;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/24
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
