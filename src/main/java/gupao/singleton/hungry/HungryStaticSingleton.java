package gupao.singleton.hungry;

/**
 * @author peng.chen12@hand-china.com
 * @description 静态代码块实现类加载时创建单例对象
 * @date 2020/2/27
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton instance;

    static {
        instance=new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return instance;
    }
}
