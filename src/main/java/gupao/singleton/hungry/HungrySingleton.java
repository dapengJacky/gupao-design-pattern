package gupao.singleton.hungry;

/**
 * @author peng.chen12@hand-china.com
 * @description
 * 线程安全，类加载的时候就实例化
 * 适用于经常被使用的场景，防止内存浪费
 * @date 2020/2/27
 */
public class HungrySingleton {

    private static final HungrySingleton instance=new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }
}
