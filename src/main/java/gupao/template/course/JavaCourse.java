package gupao.template.course;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/3/15
 */
public class JavaCourse extends AbstractCourse {
    @Override
    protected void checkHomework() {
        System.out.println("检查JAVA作业");
    }

    @Override
    protected boolean needCheck() {
        return true;
    }
}
