package gupao.factory.simple;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * @date 2020/2/24
 */
public class CourseFactory{
    /**
     * 不符合开闭原则和单一职责原则
     * 一旦其中一个产品的逻辑需要修改，代码就会修改
     * @param clazz
     * @return
     */
    public static ICourse createCourse(Class<? extends ICourse> clazz){
        try {
            if(null!=clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
