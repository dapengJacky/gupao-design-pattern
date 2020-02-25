package gupao.factory.abstractfactory;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/24
 */
public abstract class CourseFactory {

    public static void init(){
        System.out.println("初始化数据");
    }
    static {
        init();
    }

    public abstract INote createNote();

    public abstract IVideo createVideo();
}
